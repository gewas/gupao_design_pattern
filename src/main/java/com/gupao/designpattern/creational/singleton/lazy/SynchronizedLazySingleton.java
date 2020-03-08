package com.gupao.designpattern.creational.singleton.lazy;

/**
 * 3.懒汉式单例 + 方法同步锁
 * 优点：调用的时候才会实例化单例，线程安全
 * 缺点：每次都会加锁，性能堪忧。
 * 改善方向：解决性能问题
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/26 23:42
 */
public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton instance;

    private SynchronizedLazySingleton() {
    }

    public synchronized static SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }
}
