package com.gupao.designpattern.creational.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 6.静态内部类式单例 + 防御反射
 * 优点：防御了反射破坏
 * 缺点：相较之前不那么优雅了
 * 改善方向：难道就没有更优雅的单例么？
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/26 23:56
 */
public class InnerHolderSingleton2 {

    private InnerHolderSingleton2() {
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("oops!");
        }
    }

    public static InnerHolderSingleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerHolderSingleton2 INSTANCE;

        static {
            INSTANCE = new InnerHolderSingleton2();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor c = InnerHolderSingleton2.class.getDeclaredConstructor();
        c.setAccessible(true);
        Object o1 = c.newInstance();
        Object o2 = InnerHolderSingleton2.getInstance();
        System.out.println(o1);
        System.out.println(o2);
    }
}
