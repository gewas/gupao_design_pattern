package com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler;

import com.gupao.designpattern.behavioral.chainofresponsibility.builder.User;
import org.apache.commons.lang3.StringUtils;

/**
 * 验证节点，只关心参数是否合法
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:41
 */
public class ValidateHandler extends Handler<User> {
    @Override
    public void doHandle(User user) {
        if (StringUtils.isBlank(user.getUsername())) {
            System.out.println("用户名为空");
            return;
        }
        if (StringUtils.isBlank(user.getPassword())) {
            System.out.println("密码为空");
            return;
        }
        // todo 还可以验证，参数的长度、匹配简易密码加以提示等
        if (getNext() != null) {
            getNext().doHandle(user);
        }
    }
}
