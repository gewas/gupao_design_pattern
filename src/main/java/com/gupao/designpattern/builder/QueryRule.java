package com.gupao.designpattern.builder;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/29 23:22
 */
public class QueryRule {
    private String table;
    private String[] selectColumns;
    private String[] whereClause;
    private String orderBy;
    private String sql;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String[] getSelectColumns() {
        return selectColumns;
    }

    public void setSelectColumns(String[] selectColumns) {
        this.selectColumns = selectColumns;
    }

    public String[] getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(String[] whereClause) {
        this.whereClause = whereClause;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public static void main(String[] args) {
        QueryRule queryRule = new QueryRuleBuilder()
                .setTable("t_user")
                .setSelectColumns(new String[]{"id", "name", "mobile"})
                .setOrderBy("id desc")
                .build();
        System.out.println(queryRule.sql);
    }
}
