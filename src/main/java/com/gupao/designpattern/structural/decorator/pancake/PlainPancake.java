package com.gupao.designpattern.structural.decorator.pancake;

/**
 * ConcreteComponent
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:45
 */
public class PlainPancake extends Pancake {
    @Override
    protected String getMessage() {
        return "白煎饼";
    }

    @Override
    protected double getPrice() {
        return 2;
    }
}
