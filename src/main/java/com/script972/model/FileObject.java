package com.script972.model;

import java.sql.Timestamp;
import java.util.Objects;

public class FileObject {
    private String fileName;
    private long lastUpdatedDate;
    private String packName;


    public FileObject() {
    }

    public FileObject(String fileName, long lastUpdatedDate, String packName) {
        this.fileName = fileName;
        this.lastUpdatedDate = lastUpdatedDate;
        this.packName = packName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(long lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    @Override
    public String toString() {
        return "FileObject{" +
                "fileName='" + fileName + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", packName='" + packName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileObject that = (FileObject) o;
        return Objects.equals(fileName, that.fileName) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(packName, that.packName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fileName, lastUpdatedDate, packName);
    }
}
