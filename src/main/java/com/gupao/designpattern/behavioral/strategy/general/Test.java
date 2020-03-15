package com.gupao.designpattern.behavioral.strategy.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:00
 */
public class Test {

    public static void main(String[] args) {

        IStrategy strategy = new ConcreteStrategyA();

        Context context = new Context(strategy);

        context.algorithm();
    }
}
