package com.gupao.designpattern.structural.proxy.dynamic.cglib;


/**
 * cglib动态代理测试类
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:53
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        UserService userServiceProxy = (UserService) new CglibLoggerProxy().getProxy(UserService.class);
        userServiceProxy.updateUser();
    }
}
