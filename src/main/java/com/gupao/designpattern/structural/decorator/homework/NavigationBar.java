package com.gupao.designpattern.structural.decorator.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 22:25
 */
public abstract class NavigationBar {

    private List<Function> functions;

    {
        functions = new ArrayList<>(6);
    }

    protected void addFunction(Function function) {
        functions.add(function);
    }

    protected List<Function> getFunctions() {
        return functions;
    }

    public abstract void showNavigation();
}
