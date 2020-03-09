package com.gupao.designpattern.structural.bridge.general;

/**
 * 桥接模式中的，“桥”。
 * <p>
 * 连接了 IImplementor 继承体系维度和 Abstraction 继承体系维度。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:07
 */
public abstract class Abstraction {

    private IImplementor implementor;

    public Abstraction(IImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
