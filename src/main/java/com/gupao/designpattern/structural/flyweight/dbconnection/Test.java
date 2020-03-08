package com.gupao.designpattern.structural.flyweight.dbconnection;

import java.sql.Connection;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 0:39
 */
public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        System.out.println(conn);
    }
}
