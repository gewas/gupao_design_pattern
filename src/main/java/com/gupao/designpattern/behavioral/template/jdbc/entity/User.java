package com.gupao.designpattern.behavioral.template.jdbc.entity;

import lombok.Data;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 21:02
 */
@Data
public class User {
    private String username;
    private String password;
    private String nickname;
    private int age;
    private String addr;
}
