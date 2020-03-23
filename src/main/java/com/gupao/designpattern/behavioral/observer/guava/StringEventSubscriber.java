package com.gupao.designpattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:41
 */
public class StringEventSubscriber {

    @Subscribe
    public void eventHandler(String event) {
        System.out.println(toString() + " - receive event: " + event);
    }
}
