package com.gupao.designpattern.decorator.homework;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 23:03
 */
public class UserNavigationBarDecorator extends NavigationBar {

    private NavigationBar navigationBar;

    public UserNavigationBarDecorator(NavigationBar navigationBar) {
        this.navigationBar = navigationBar;
        addFunction(new Function(2L, "作业", "/homework"));
        addFunction(new Function(3L, "题库", "/question-bank"));
        addFunction(new Function(4L, "成长墙", "/growth--wall"));
    }

    @Override
    public void showNavigation() {
        List<Function> toShowList = getFunctions();
        toShowList.addAll(navigationBar.getFunctions());
        Collections.sort(toShowList);
        System.out.println(new Gson().toJson(toShowList));
    }
}
