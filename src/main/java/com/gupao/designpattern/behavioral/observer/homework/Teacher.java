package com.gupao.designpattern.behavioral.observer.homework;

import com.google.common.eventbus.Subscribe;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 20:58
 */
public class Teacher {

    private User user;

    public Teacher(User user) {
        this.user = user;
    }

    @Subscribe
    public void questionHandler(Question newQuestion) {
        System.out.println(user.getUsername() + "老师，您收到一个新的问题：" + newQuestion);
    }
}
