package com.gupao.designpattern.structural.facade;

/**
 * 客户端
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:00
 */
public class Client {

    public static void main(String[] args) {
        // 1.普通使用，造成客户端代码杂乱多余
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();
        SubSystemC subSystemC = new SubSystemC();

        subSystemA.doWorkA();
        subSystemB.doWorkB();
        subSystemC.doWorkC();

        // 2.利用了门面模式以后
        Facade facade = new Facade();
        facade.doWorkA();
        facade.doWorkB();
        facade.doWorkC();
    }
}
