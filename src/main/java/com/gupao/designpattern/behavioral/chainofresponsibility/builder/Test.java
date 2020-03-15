package com.gupao.designpattern.behavioral.chainofresponsibility.builder;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:45
 */
public class Test {
    public static void main(String[] args) {
        new LoginService().login("aaa", "sss");
        System.out.println("=================");
        new LoginService().login("admin", "admin");
    }
}
