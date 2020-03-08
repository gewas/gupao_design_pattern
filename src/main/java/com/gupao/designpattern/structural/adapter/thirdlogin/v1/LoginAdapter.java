package com.gupao.designpattern.structural.adapter.thirdlogin.v1;

import com.gupao.designpattern.structural.adapter.thirdlogin.ILogin;
import com.gupao.designpattern.structural.adapter.thirdlogin.LoginService;
import com.gupao.designpattern.structural.adapter.thirdlogin.ResultMsg;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 23:50
 */
public class LoginAdapter implements ILogin {

    private LoginService loginService;

    public LoginAdapter(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public ResultMsg loginQQ(String openid) {
        loginService.register(openid, null);
        return loginService.login(openid, null);
    }

    @Override
    public ResultMsg loginWechat(String openid) {
        // 略有不同的处理
        loginService.register(openid, null);
        return loginService.login(openid, null);
    }

    @Override
    public ResultMsg loginToken(String token) {
        // 略有不同的处理
        loginService.register(token, null);
        return loginService.login(token, null);
    }

    @Override
    public ResultMsg loginPhone(String phone, String code) {
        // 略有不同的处理
        loginService.register(phone, null);
        return loginService.login(phone, null);
    }
}
