package com.gupao.designpattern.proxy.dynamic.jdk;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 23:01
 */
public class Subject implements ISubject {
    @Override
    public void doWork() {
        System.out.println("do jdk proxy!");
    }
}
