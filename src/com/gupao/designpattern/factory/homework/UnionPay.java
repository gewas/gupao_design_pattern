package com.gupao.designpattern.factory.homework;

/**
 * 银联支付
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/23 23:12
 */
public class UnionPay implements AbstractPayment {
    @Override
    public String pay(String orderInfo) {
        return null;
    }

    @Override
    public String refund(String paymentInfo) {
        return null;
    }
}
