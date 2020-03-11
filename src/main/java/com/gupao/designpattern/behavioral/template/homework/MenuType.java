package com.gupao.designpattern.behavioral.template.homework;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 23:44
 */
public enum MenuType {

    DISH("菜肴"), DESSERT("甜点"), DRINK("饮料");

    private String typeName;

    MenuType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
