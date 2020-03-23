package com.gupao.designpattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

import java.sql.Timestamp;
import java.time.Instant;

/**
 * Guava 的观察者模式实现
 * <p>
 * 通过统一的 EventBus 来处理：事件发布、订阅/退订。
 * 通过 @Subscribe 注解来标注处理事件方法，订阅者的粒度到达了方法级别。
 *
 * 可惜，到本代码完成，Guava 的观察者模式实现仍然处于 beta 阶段。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:47
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new StringEventSubscriber());
        eventBus.register(new UserLoginEventSubscriber());

        eventBus.post("StringEvent");
        eventBus.post(new UserLogin(2L, "gewas", Timestamp.from(Instant.now())));
        //  没有对应的订阅方法，所以不会有处理
        eventBus.post(5);
    }
}
