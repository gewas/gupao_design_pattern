package com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler;

import com.gupao.designpattern.behavioral.chainofresponsibility.builder.User;

/**
 * 登录节点，只关心账密匹配与角色注入
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:40
 */
public class LoginHandler extends Handler<User> {
    @Override
    public void doHandle(User user) {
        // 这里的逻辑时demo用，真实是不可能如此操作的
        if ("admin".equals(user.getUsername())) {
            user.setRole("admin");
        }
        if (getNext() != null) {
            getNext().doHandle(user);
        }
    }
}
