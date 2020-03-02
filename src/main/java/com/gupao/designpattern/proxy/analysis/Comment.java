package com.gupao.designpattern.proxy.analysis;

import java.sql.Timestamp;

/**
 * 分析用
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/2 13:32
 */
public class Comment {
    private long newsId;
    private long userId;
    private String comment;
    private Timestamp commentTs;

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getCommentTs() {
        return commentTs;
    }

    public void setCommentTs(Timestamp commentTs) {
        this.commentTs = commentTs;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "newsId=" + newsId +
                ", userId=" + userId +
                ", comment='" + comment + '\'' +
                ", commentTs=" + commentTs +
                '}';
    }
}
