package com.gupao.designpattern.creational.factory.homework;

/**
 * 支付抽象工厂
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/23 23:33
 */
public interface AbstractPayment {
    /**
     * 向支付渠道请求支付
     *
     * @param orderInfo 通常是一个订单实体，但是Demo就省略细节了
     * @return 渠道所返回的支付单信息
     */
    String pay(String orderInfo);

    /**
     * 向支付渠道请求退款
     *
     * @param paymentInfo 成功支付的记录信息
     * @return
     */
    String refund(String paymentInfo);
}
