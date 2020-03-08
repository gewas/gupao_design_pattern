package com.gupao.designpattern.creational.singleton.register;

/**
 * 7.枚举式单例
 * 优点：天生单例，jdk保证其不会被反射破坏
 * 缺点：
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/27 0:10
 * @see Enum#valueOf(Class, String) 中体现了枚举的唯一实例被维护在enumConstantDirectory字典中，算是一种注册式单例。
 */
public enum EnumSingleton {
    INSTANCE;

    private Object tag;

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
