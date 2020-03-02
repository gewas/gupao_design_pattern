package com.gupao.designpattern.proxy.dynamic.jdk;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 23:01
 */
public class UserService implements IUserService {
    @Override
    public void updateUser() {
        System.out.println("updateUser()");
    }
}