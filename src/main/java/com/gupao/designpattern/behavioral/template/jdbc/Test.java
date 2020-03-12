package com.gupao.designpattern.behavioral.template.jdbc;

import com.gupao.designpattern.behavioral.template.jdbc.dao.UserDao;

import javax.sql.DataSource;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 21:23
 */
public class Test {
    public static void main(String[] args) {
        // todo 获取数据源
        DataSource dataSource = null;
        new UserDao(dataSource).selectAll();
    }
}
