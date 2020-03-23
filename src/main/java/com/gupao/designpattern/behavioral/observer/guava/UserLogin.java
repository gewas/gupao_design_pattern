package com.gupao.designpattern.behavioral.observer.guava;

import java.sql.Timestamp;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:41
 */
public class UserLogin {
    private Long uid;
    private String username;
    private Timestamp loginTs;

    public UserLogin(Long uid, String username, Timestamp loginTs) {
        this.uid = uid;
        this.username = username;
        this.loginTs = loginTs;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", loginTs=" + loginTs +
                '}';
    }
}
