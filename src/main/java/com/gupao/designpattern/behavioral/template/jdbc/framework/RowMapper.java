package com.gupao.designpattern.behavioral.template.jdbc.framework;

import java.sql.ResultSet;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 21:03
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
