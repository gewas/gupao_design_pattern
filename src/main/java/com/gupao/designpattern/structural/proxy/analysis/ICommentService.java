package com.gupao.designpattern.structural.proxy.analysis;

import java.util.List;

/**
 * 用于jdk动态代理原理分析的接口
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/2 13:30
 */
public interface ICommentService {

    Comment updateComment(long id, String comment);

    List<Comment> getComments(long newsId);

    void clearComments();

    void createComment(Comment comment);
}
