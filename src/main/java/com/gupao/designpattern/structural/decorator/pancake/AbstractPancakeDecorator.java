package com.gupao.designpattern.structural.decorator.pancake;

/**
 * Decorator
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:45
 */
public abstract class AbstractPancakeDecorator extends Pancake {

    protected Pancake pancake;

    public AbstractPancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }
}
