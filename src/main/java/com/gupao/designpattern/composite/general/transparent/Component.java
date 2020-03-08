package com.gupao.designpattern.composite.general.transparent;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 10:53
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operate();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("removeChild not supported!");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("getChild not supported!");
    }

}
