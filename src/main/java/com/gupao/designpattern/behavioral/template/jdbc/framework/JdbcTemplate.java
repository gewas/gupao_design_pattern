package com.gupao.designpattern.behavioral.template.jdbc.framework;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 21:03
 */
public class JdbcTemplate<T> {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final List<T> query(String sql, Object[] values, RowMapper<T> rowMapper) {
        try {
            // 1 获取链接
            Connection conn = getConnection();
            // 2 创建语句集
            PreparedStatement ps = createPreparedStatement(conn, sql);
            // 3 执行语句集
            ResultSet rs = executeQuery(ps, values);
            // 4 处理结果集
            List<T> result = parseResultSet(rs, rowMapper);
            // 5 关闭结果集
            rs.close();
            // 6 关闭语句集
            ps.close();
            // 7 关闭链接
            conn.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<T> parseResultSet(ResultSet rs, RowMapper<T> rowMapper) throws Exception {
        List<T> result = new ArrayList<>(8);
        int rowNum = 0;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement ps, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            ps.setObject(i, values[i]);
        }
        return ps.executeQuery();
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
