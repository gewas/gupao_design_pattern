package com.gupao.designpattern.flyweight.general;

/**
 * 享元模式
 * <p>
 * 是一种缓存，池化设计模式；
 * 可以避免重复创建销毁同一类对象；
 * 对象的内部状态可以共享，外部状态供外部使用；
 * 通常使用后会有回收操作。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/7 23:48
 */
public class Test {
    public static void main(String[] args) {
        IFlyweight flyweight0 = FlyweightFactory.getFlyweight("A");
        flyweight0.operate("haha");
        IFlyweight flyweight1 = FlyweightFactory.getFlyweight("A");
        flyweight1.operate("hehe");
        IFlyweight flyweight2 = FlyweightFactory.getFlyweight("B");
        flyweight2.operate("hoho");
    }
}
