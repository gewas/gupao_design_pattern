package com.gupao.designpattern.structural.decorator.general;

/**
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 22:17
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        System.out.println("ConcreteDecoratorB.operate()");
        component.operate();
    }
}
