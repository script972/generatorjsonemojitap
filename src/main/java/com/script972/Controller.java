package com.script972;

import com.script972.dao.FileObjectDAO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public void start() {
        System.out.println("Please input path to directory");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        List<String> files = getAllFileFromDirectory(filePath);
        new FileObjectDAO().generatorJSON(files);

    }

    private List<String> getAllFileFromDirectory(String filePath){
        File folder = new File(filePath);
        File[] listOfFiles = folder.listFiles();
        List<String> resultFiles=new ArrayList<>();
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                resultFiles.add(listOfFile.getName());
            }
        }
        return resultFiles;
    }
}
