package com.gupao.designpattern.behavioral.template.jdbc.dao;

import com.gupao.designpattern.behavioral.template.jdbc.entity.User;
import com.gupao.designpattern.behavioral.template.jdbc.framework.JdbcTemplate;
import com.gupao.designpattern.behavioral.template.jdbc.framework.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 21:02
 */
public class UserDao extends JdbcTemplate<User> {

    public UserDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<User> selectAll() {
        String sql = "select * from t_user";
        return query(sql, null, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws Exception {
                User user = new User();
                // todo 可使用原型模式优化
                user.setUsername(rs.getString("username"));
                user.setNickname(rs.getString("nickname"));
                user.setPassword(rs.getString("password"));
                user.setAge(rs.getInt("age"));
                user.setAddr(rs.getString("addr"));
                return user;
            }
        });
    }
}
