package com.gupao.designpattern.behavioral.template.homework;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 23:57
 */
public interface DishResolver {
    String getCooker();

    default Boolean needDecorate() {
        return false;
    }

    String getContainer();

    default String getDecorateWith() {
        return "";
    }

    int getMakingTime();

}
