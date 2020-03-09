package com.gupao.designpattern.structural.composite.homework.xpath;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:50
 */
public class Directory extends File {

    public Directory(String dirPath, String dirName) {
        super(dirPath, dirName);
    }

    public File newFile(String filename) {
        File file = new File(getFilepath(), filename);
        if (!FileManager.addFile(file)) {
            System.err.println("新建文件失败！");
            return null;
        }
        return file;
    }

    public Directory newDirectory(String dirName) {
        Directory file = new Directory(getFilepath(), dirName);
        if (!FileManager.addFile(file)) {
            System.err.println("新建文件夹失败！");
            return null;
        }
        return file;
    }

    public List<File> listDir() {
        return FileManager.listFile(getFilepath());
    }

    @Override
    public boolean delete() {
        List<File> list = FileManager.listFile(getFilepath());
        for (File file : list) {
            if (file == this) {
                continue;
            }
            if (!file.delete()) {
                return false;
            }
        }
        return super.delete();
    }

    @Override
    public String getFilepath() {
        return super.getFilepath() + PATH_SEPARATOR;
    }
}
