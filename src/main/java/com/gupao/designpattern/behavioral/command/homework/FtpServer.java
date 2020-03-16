package com.gupao.designpattern.behavioral.command.homework;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 21:08
 */
public class FtpServer {

    private String host;

    public FtpServer(String host) {
        this.host = host;
    }

    public void upload() {
        System.out.println(host + "/ upload");
    }

    public void list() {
        System.out.println(host + "/ list");
    }

    public void download() {
        System.out.println(host + "/ download");
    }
}
