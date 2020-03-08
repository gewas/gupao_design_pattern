package com.gupao.designpattern.creational.builder;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/29 23:22
 */
public class QueryRuleBuilder {
    private QueryRule queryRule = new QueryRule();


    public QueryRuleBuilder setTable(String table) {
        queryRule.setTable(table);
        return this;
    }


    public QueryRuleBuilder setSelectColumns(String[] selectColumns) {
        queryRule.setSelectColumns(selectColumns);
        return this;
    }


    public QueryRuleBuilder setWhereClause(String[] whereClause) {
        queryRule.setWhereClause(whereClause);
        return this;
    }

    public QueryRuleBuilder setOrderBy(String orderBy) {
        queryRule.setOrderBy(orderBy);
        return this;
    }

    public QueryRule build() {
        StringBuilder sql = new StringBuilder();
        // todo 一些复杂的构建规则
        sql.append("select ");
        for (int i = 0; i < queryRule.getSelectColumns().length; i++) {
            if (i > 0) {
                sql.append(", ");
            }
            sql.append(queryRule.getSelectColumns()[i]);
        }
        sql.append(" from ")
                .append(queryRule.getTable()).append(" ");
        if (queryRule.getWhereClause() != null) {
            sql.append(" where ");
            for (int i = 0; i < queryRule.getWhereClause().length; i++) {
                sql.append(queryRule.getWhereClause()[i])
                        .append(" ");
            }
        }
        if (queryRule.getOrderBy() != null) {
            sql.append(" order by ").append(queryRule.getOrderBy());
        }
        queryRule.setSql(sql.toString());
        return queryRule;
    }

}
