package com.gupao.designpattern.structural.decorator.pancake;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 21:50
 */
public class Client {
    public static void main(String[] args) {
        PlainPancake plainPancake = new PlainPancake();
        AbstractPancakeDecorator eggDecorator = new EggDecorator(plainPancake);
        AbstractPancakeDecorator meetDecorator = new MeetDecorator(eggDecorator);

        System.out.println(meetDecorator.getMessage() + " $" + meetDecorator.getPrice());
    }
}
