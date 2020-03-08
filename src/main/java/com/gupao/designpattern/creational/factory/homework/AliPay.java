package com.gupao.designpattern.creational.factory.homework;

/**
 * 支付宝
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/23 23:12
 */
public class AliPay implements AbstractPayment {
    @Override
    public String pay(String orderInfo) {
        return null;
    }

    @Override
    public String refund(String paymentInfo) {
        return null;
    }
}
