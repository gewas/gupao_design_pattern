package com.gupao.designpattern.structural.adapter.thirdlogin.v2;

import com.gupao.designpattern.structural.adapter.thirdlogin.ILogin;
import com.gupao.designpattern.structural.adapter.thirdlogin.ResultMsg;
import com.gupao.designpattern.structural.adapter.thirdlogin.v2.adapter.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 0:13
 */
public class LoginAdapter implements ILogin {

    private static List<IAdapter> adapters;

    public static boolean registerAdapter(IAdapter adapter) {
        if (adapters == null) {
            adapters = new ArrayList<>(8);
        }
        if (!adapters.contains(adapter)) {
            return adapters.add(adapter);
        }
        return false;
    }

    @Override
    public ResultMsg loginQQ(String openid) {
        return processLogin(openid, LoginQQAdapter.class);
    }

    @Override
    public ResultMsg loginWechat(String openid) {
        return processLogin(openid, LoginWechatAdapter.class);
    }

    @Override
    public ResultMsg loginToken(String token) {
        return processLogin(token, LoginTokenAdapter.class);
    }

    @Override
    public ResultMsg loginPhone(String phone, String code) {
        return processLogin(phone, LoginPhoneAdapter.class);
    }

    protected ResultMsg processLogin(String id, Class<? extends IAdapter> clazz) {
        try {
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            IAdapter adapter = (IAdapter) c.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
