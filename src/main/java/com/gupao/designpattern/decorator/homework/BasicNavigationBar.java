package com.gupao.designpattern.decorator.homework;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 22:27
 */
public class BasicNavigationBar extends NavigationBar {
    {
        addFunction(new Function(0L, "问答", "/index"));
        addFunction(new Function(1L, "文章", "/article"));
        addFunction(new Function(5L, "精品课", "/resources"));
        addFunction(new Function(6L, "冒泡", "/bubbling"));
        addFunction(new Function(7L, "商城", "/shop"));
    }

    @Override
    public void showNavigation() {
        System.out.println(new Gson().toJson(getFunctions()));
    }
}
