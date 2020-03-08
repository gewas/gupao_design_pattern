package com.gupao.designpattern.structural.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/7 20:21
 */
public class FlyweightFactory {

    private static Map<String, IFlyweight> pool = new HashMap<>(16);

    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }

}
