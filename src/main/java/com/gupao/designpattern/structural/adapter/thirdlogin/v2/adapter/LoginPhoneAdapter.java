package com.gupao.designpattern.structural.adapter.thirdlogin.v2.adapter;

import com.gupao.designpattern.structural.adapter.thirdlogin.LoginService;
import com.gupao.designpattern.structural.adapter.thirdlogin.ResultMsg;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 0:08
 */
public class LoginPhoneAdapter extends AbstractAdapter {

    protected LoginPhoneAdapter() {
        super();
    }

    protected LoginPhoneAdapter(LoginService loginService) {
        super(loginService);
    }

    @Override
    public boolean support(Object object) {
        return object instanceof LoginPhoneAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegister(id, null);
    }
}
