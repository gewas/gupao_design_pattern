package com.gupao.designpattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:41
 */
public class UserLoginEventSubscriber {

    @Subscribe
    public void eventHandler(UserLogin event) {
        System.out.println(toString() + " - receive event: " + event);
    }
}
