package com.gupao.designpattern.structural.decorator.pancake;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:45
 */
public class MeetDecorator extends AbstractPancakeDecorator {


    public MeetDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    protected String getMessage() {
        return pancake.getMessage() + " 1份肉丝";
    }

    @Override
    protected double getPrice() {
        return pancake.getPrice() + 5;
    }
}
