package com.gupao.designpattern.singleton.lazy;

/**
 * 5.静态内部类式单例
 * 优点：优雅
 * 缺点：会被反射破坏
 * 改善方向：防御反射
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/26 23:56
 */
public class InnerHolderSingleton {

    static {
        System.out.println("InnerHolderSingleton类被加载！");
    }

    private InnerHolderSingleton() {
    }

    public static InnerHolderSingleton getInstance() {
        System.out.println("getInstance()");
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerHolderSingleton INSTANCE;

        static {
            INSTANCE = new InnerHolderSingleton();
            System.out.println("InnerHolder 实例化了单例！");
        }
    }

    public static void main(String[] args) {
        getInstance();
    }
}
