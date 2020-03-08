package com.gupao.designpattern.structural.decorator.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 22:19
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decoratorA = new ConcreteDecoratorA(component);
        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);

        decoratorB.operate();
    }
}
