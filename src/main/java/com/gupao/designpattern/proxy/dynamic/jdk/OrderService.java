package com.gupao.designpattern.proxy.dynamic.jdk;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 23:01
 */
public class OrderService implements IOrderService {

    @Override
    public void createOrder() {
        System.out.println("createOrder()");
    }
}
