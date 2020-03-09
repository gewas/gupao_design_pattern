package com.gupao.designpattern.structural.composite.homework.xpath;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 15:19
 */
public class Test {
    public static void main(String[] args) {
        Directory root = new Directory("", "");
        root.newFile("centos");
        Directory home = root.newDirectory("home");
        home.newFile("readme.txt");
        home.newDirectory("user1").newFile("user1.txt");
        home.newDirectory("user2").newFile("user2.txt");

        Directory rootHome = root.newDirectory("root");
        rootHome.newFile("root.md");
        rootHome.newDirectory("nginx").newDirectory("bin").newFile("nginx");

        Directory etc = root.newDirectory("etc");
        etc.newFile("hosts");
        Directory etcNginx = etc.newDirectory("nginx");
        etcNginx.newFile("config");
        etcNginx.newFile("template");
        etcNginx.newDirectory("module");

        System.out.println("root/dir: " + root.listDir());
        root.listDir().get(0).delete();
        System.out.println("root/dir: " + root.listDir());
        System.out.println("home/dir: " + home.listDir());
        System.out.println("etc/dir: " + etc.listDir());
        System.out.println("nginx/dir: " + etcNginx.listDir());
        etcNginx.delete();
        System.out.println("nginx/dir: " + etcNginx.listDir());
    }
}
