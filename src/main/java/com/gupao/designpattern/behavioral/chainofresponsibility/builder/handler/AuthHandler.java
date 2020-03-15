package com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler;

import com.gupao.designpattern.behavioral.chainofresponsibility.builder.User;

/**
 * 授权节点，只处理鉴权授权
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:40
 */
public class AuthHandler extends Handler<User> {
    @Override
    public void doHandle(User user) {
        if ("admin".equals(user.getRole())) {
            System.out.println("获得管理员权限");
        }
        if (getNext() != null) {
            getNext().doHandle(user);
        }
    }
}
