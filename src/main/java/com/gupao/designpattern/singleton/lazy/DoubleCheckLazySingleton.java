package com.gupao.designpattern.singleton.lazy;

/**
 * 4.懒汉式单例 + 双重检查 + 代码块同步锁
 * 优点：调用的时候才会实例化单例，线程安全，性能优秀
 * 缺点：不优雅，可读性稍差
 * 改善方向：优雅
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/26 23:42
 */
public class DoubleCheckLazySingleton {

    private volatile static DoubleCheckLazySingleton instance;

    private DoubleCheckLazySingleton() {
    }

    public synchronized static DoubleCheckLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    // 这里会有指令重排的问题，所以要用volatile关键字修饰单例
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
