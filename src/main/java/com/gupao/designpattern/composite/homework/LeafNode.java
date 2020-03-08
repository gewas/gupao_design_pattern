package com.gupao.designpattern.composite.homework;

import java.util.HashMap;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 15:24
 */
public class LeafNode extends AbstractNode {

    public LeafNode(String name, String value) {
        super(name, value);
    }

    @Override
    public String getInfo() {
        return getHead() + value + getTail();
    }

}
