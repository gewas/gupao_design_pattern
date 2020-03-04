package com.gupao.designpattern.decorator.pancake;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:45
 */
public class EggDecorator extends AbstractPancakeDecorator {

    public EggDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    protected String getMessage() {
        return pancake.getMessage() + " 1个鸡蛋";
    }

    @Override
    protected double getPrice() {
        return pancake.getPrice() + 2;
    }
}
