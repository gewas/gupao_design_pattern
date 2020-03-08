package com.gupao.designpattern.structural.adapter.thirdlogin;

import com.gupao.designpattern.structural.adapter.thirdlogin.ResultMsg;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 23:48
 */
public interface ILogin {

    ResultMsg loginQQ(String openid);

    ResultMsg loginWechat(String openid);

    ResultMsg loginToken(String token);

    ResultMsg loginPhone(String phone, String code);
}
