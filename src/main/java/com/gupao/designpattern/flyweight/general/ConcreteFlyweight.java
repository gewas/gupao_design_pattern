package com.gupao.designpattern.flyweight.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/7 23:43
 */
public class ConcreteFlyweight implements IFlyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operate(String extrinsicState) {
        System.out.println(System.identityHashCode(this));
        System.out.println(intrinsicState);
        System.out.println(extrinsicState);
    }
}
