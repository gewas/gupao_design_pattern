package com.gupao.designpattern.proxy.dynamic.jdk;

/**
 * Jdk动态代理测试类
 * <p>
 * jdk动态代理要求目标类必须实现接口，因为jdk动态代理是基于接口实现的代理逻辑。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:53
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        IUserService userServiceProxy = (IUserService) LoggerProxy.getProxy(new UserService());
        IOrderService orderServiceProxy = (IOrderService) LoggerProxy.getProxy(new OrderService());
        userServiceProxy.updateUser();
        orderServiceProxy.createOrder();
    }
}
