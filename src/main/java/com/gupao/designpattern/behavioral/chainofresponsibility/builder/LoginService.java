package com.gupao.designpattern.behavioral.chainofresponsibility.builder;

import com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler.AuthHandler;
import com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler.Handler;
import com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler.LoginHandler;
import com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler.ValidateHandler;

/**
 * 结合Builder的责任链，构建链的时候很直观优雅。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:42
 */
public class LoginService {

    public void login(String username, String password) {
        Handler<User> handler = new Handler.Builder<User>()
                .addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler())
                .build();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        handler.doHandle(user);
    }
}
