package com.gupao.designpattern.flyweight.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 0:36
 */
public class ConnectionPool {

    private Vector<Connection> pool;
    private String url = "jdbc:mysql://localhost:3306/xxx";
    private String username = "root";
    private String password = "654321";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 100;

    public ConnectionPool() {
        pool = new Vector<>(poolSize);

        try {
            Class.forName(driverClassName);
            for (int i = 0; i < poolSize; i++) {
                Connection conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            return pool.remove(0);
        }
        return null;
    }

    public synchronized void release(Connection conn) {
        pool.add(conn);
    }
}
