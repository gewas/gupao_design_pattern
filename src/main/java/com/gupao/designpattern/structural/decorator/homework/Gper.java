package com.gupao.designpattern.structural.decorator.homework;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 23:16
 */
public class Gper {
    public static void main(String[] args) {
        NavigationBar basicBar = new BasicNavigationBar();
        NavigationBar userBar = new UserNavigationBarDecorator(basicBar);
        userBar.showNavigation();
        basicBar.showNavigation();
    }
}
