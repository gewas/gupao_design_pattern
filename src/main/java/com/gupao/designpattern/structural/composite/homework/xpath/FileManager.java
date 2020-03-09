package com.gupao.designpattern.structural.composite.homework.xpath;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 15:01
 */
public class FileManager {

    public static boolean addFile(File file) {
        if (!Holder.FILE_LIST.contains(file)) {
            return Holder.FILE_LIST.add(file);
        }
        return false;
    }

    public static boolean removeFile(File file) {
        return Holder.FILE_LIST.remove(file);
    }

    public static List<File> listFile(String dirPath) {
        return Holder.FILE_LIST.stream().filter(file -> {
            boolean prefix = StringUtils.startsWith(file.getFilepath(), dirPath);

            String filepath = file.getFilepath();
            filepath = StringUtils.removeStart(filepath, dirPath);
            filepath = StringUtils.removeEnd(filepath, File.PATH_SEPARATOR);
            boolean inDir = !StringUtils.contains(filepath, File.PATH_SEPARATOR);

            return prefix && inDir;
        }).collect(Collectors.toList());
    }

    private static class Holder {
        private static final List<File> FILE_LIST = new ArrayList<>(16);
    }
}
