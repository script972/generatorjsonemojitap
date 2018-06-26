package com.script972.dao;

import com.google.gson.Gson;
import com.script972.model.FileObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileObjectDAO {

    public void generatorJSON(List<String> files) {
        List<FileObject> fileObjects = new ArrayList<>();
        System.out.println("fileSize="+files.size());
        for (int i = 0; i < files.size(); i++) {
            FileObject fileObject=new FileObject();
            fileObject.setFileName(files.get(0));
            fileObject.setLastUpdatedDate(System.currentTimeMillis());
            fileObject.setPackName("");
            fileObjects.add(fileObject);
        }
        String outputJSON = getJson(fileObjects);
        try {
            File file = new File("FreeImages.json");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(file));
            PrintWriter printWriter=new PrintWriter(bufferedOutputStream);
            printWriter.write(outputJSON);
            printWriter.flush();
            printWriter.close();
            bufferedOutputStream.close();
            System.out.println(file.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getJson(List<FileObject> fileObjects) {
        return new Gson().toJson(fileObjects);
    }
}
