package com.gupao.designpattern.structural.adapter.thirdlogin.v2.adapter;

import com.gupao.designpattern.structural.adapter.thirdlogin.LoginService;
import com.gupao.designpattern.structural.adapter.thirdlogin.ResultMsg;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 0:09
 */
public abstract class AbstractAdapter implements IAdapter {

    private LoginService loginService;

    protected AbstractAdapter() {
        this(new LoginService());
    }

    protected AbstractAdapter(LoginService loginService) {
        this.loginService = loginService;
    }

    protected ResultMsg loginForRegister(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        loginService.register(username, password);
        return loginService.login(username, password);
    }
}
