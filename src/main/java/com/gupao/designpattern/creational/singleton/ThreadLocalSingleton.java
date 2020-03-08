package com.gupao.designpattern.creational.singleton;

/**
 * sp.ThreadLocal单例
 * 优点：线程隔离，每个线程各一个单例。
 * 缺点：
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/27 1:30
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> LOCAL = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return LOCAL.get();
    }

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new ThreadLocalSingletonExecutor());
        Thread t2 = new Thread(new ThreadLocalSingletonExecutor());
        Thread t3 = new Thread(new ThreadLocalSingletonExecutor());
        t1.start();
        t2.start();
        t3.start();
    }

    private static class ThreadLocalSingletonExecutor implements Runnable {

        @Override
        public void run() {
            ThreadLocalSingleton s = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + s);
        }
    }
}
