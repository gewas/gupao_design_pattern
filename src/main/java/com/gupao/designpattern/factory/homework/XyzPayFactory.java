package com.gupao.designpattern.factory.homework;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 0:12
 */
public class XyzPayFactory implements IPaymentFactory {
    @Override
    public AbstractPayment getInstance() {
        return new XyzPay();
    }
}
