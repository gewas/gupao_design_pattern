package com.gupao.designpattern.behavioral.template.homework;

import lombok.Builder;
import lombok.Data;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 23:43
 */
@Builder
@Data
public class MenuItem implements Comparable<MenuItem> {

    private String name;
    private MenuType menuType;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrief() {
        return getMenuType().getTypeName() + " - " + getName();
    }

    public String getDetail() {
        return getMenuType().getTypeName() + " - " + getName() + " - " + getPrice();
    }

    @Override
    public int compareTo(MenuItem o) {
        int result = getMenuType().compareTo(o.getMenuType());
        if (result == 0) {
            result = getName().compareTo(o.getName());
        }
        return result;
    }
}
