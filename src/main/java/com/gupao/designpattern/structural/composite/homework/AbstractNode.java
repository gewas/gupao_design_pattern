package com.gupao.designpattern.structural.composite.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 15:20
 */
public abstract class AbstractNode {

    protected String name;
    protected String value;
    private Map<String, String> properties;

    public AbstractNode(String name, String value) {
        this.name = name;
        this.value = value;
        properties = new HashMap<>(8);
    }

    public abstract String getInfo();

    public AbstractNode addProperty(String key, String value) {
        properties.put(key, value);
        return this;
    }

    private String getProperties() {
        StringBuilder sb = new StringBuilder();
        properties.forEach((k, v) -> {
            sb.append(" ").append(k).append("=").append("\"").append(v).append("\"");
        });
        return sb.toString();
    }

    protected String getHead() {
        return "<" + name + getProperties() + ">";
    }

    protected String getTail() {
        return "</" + name + ">";
    }
}
