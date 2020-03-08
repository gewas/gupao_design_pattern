package com.gupao.designpattern.creational.singleton.hungry;

/**
 * 1.饿汉式单例
 * 优点：简单
 * 缺点：无论用不用，只要类被加载即会实例化单例，可能造成内存浪费。
 * 改良方向：可不可以真正调用的时候再实例化单例。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/26 23:37
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
