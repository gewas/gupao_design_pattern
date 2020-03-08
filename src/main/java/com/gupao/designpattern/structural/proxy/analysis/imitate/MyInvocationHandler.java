package com.gupao.designpattern.structural.proxy.analysis.imitate;

import java.lang.reflect.Method;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/2 14:03
 */
public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
