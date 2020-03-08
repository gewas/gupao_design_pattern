package com.gupao.designpattern.structural.adapter.thirdlogin.v2;

import com.gupao.designpattern.structural.adapter.thirdlogin.ResultMsg;
import com.gupao.designpattern.structural.adapter.thirdlogin.v2.LoginAdapter;
import com.gupao.designpattern.structural.adapter.thirdlogin.v2.adapter.LoginTikTokAdapter;

/**
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 0:32
 */
public class TikTokLoginAdapterDecorator extends LoginAdapter {

    private LoginAdapter loginAdapter;

    public TikTokLoginAdapterDecorator(LoginAdapter loginAdapter) {
        this.loginAdapter = loginAdapter;
    }

    @Override
    public ResultMsg loginQQ(String openid) {
        return super.loginQQ(openid);
    }

    @Override
    public ResultMsg loginWechat(String openid) {
        return super.loginWechat(openid);
    }

    @Override
    public ResultMsg loginToken(String token) {
        return super.loginToken(token);
    }

    @Override
    public ResultMsg loginPhone(String phone, String code) {
        return super.loginPhone(phone, null);
    }

    public ResultMsg loginTikTok(String openid) {
        return super.processLogin(openid, LoginTikTokAdapter.class);
    }
}
