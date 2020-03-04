package com.gupao.designpattern.decorator.general;

/**
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 22:17
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        System.out.println("ConcreteDecoratorA.operate()");
        component.operate();
    }
}
