package com.gupao.designpattern.structural.composite.homework.xpath;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:43
 */
public class File {

    public static final String PATH_SEPARATOR = "/";

    private String dirPath;

    private String filename;

    public File(String dirPath, String filename) {
        this.dirPath = dirPath;
        this.filename = filename;
    }

    public boolean delete() {
        return FileManager.removeFile(this);
    }

    public String getFilepath() {
        return dirPath + filename;
    }

    @Override
    public String toString() {
        return this.getFilepath();
    }
}
