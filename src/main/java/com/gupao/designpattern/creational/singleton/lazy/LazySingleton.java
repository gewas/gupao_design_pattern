package com.gupao.designpattern.creational.singleton.lazy;

/**
 * 2.懒汉式单例
 * 优点：调用的时候才会实例化单例
 * 缺点：线程不安全
 * 改善方向：解决线程安全问题
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/26 23:42
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            //这里有线程安全问题
            instance = new LazySingleton();
        }
        return instance;
    }
}
