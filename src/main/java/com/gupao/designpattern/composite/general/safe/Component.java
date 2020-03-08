package com.gupao.designpattern.composite.general.safe;

/**
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 11:33
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operate();
}
