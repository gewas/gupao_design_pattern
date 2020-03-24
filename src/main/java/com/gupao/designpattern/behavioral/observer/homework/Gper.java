package com.gupao.designpattern.behavioral.observer.homework;

import com.google.common.eventbus.EventBus;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 20:57
 */
public class Gper {

    private static final Gper GPER = new Gper();
    private EventBus eventBus = new EventBus();

    private Gper() {
    }

    public static Gper getInstance() {
        return GPER;
    }

    public void subscribeQuestion(Teacher teacher) {
        eventBus.register(teacher);
    }

    public void unsubscribeQuestion(Teacher teacher) {
        eventBus.unregister(teacher);
    }

    public void makeQuestion(Question question) {
        eventBus.post(question);
    }
}
