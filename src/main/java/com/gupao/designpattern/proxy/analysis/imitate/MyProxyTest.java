package com.gupao.designpattern.proxy.analysis.imitate;

import com.gupao.designpattern.proxy.analysis.Comment;
import com.gupao.designpattern.proxy.analysis.CommentService;
import com.gupao.designpattern.proxy.analysis.ICommentService;

/**
 * 徒手模拟动态代理测试类
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/2 14:10
 */
public class MyProxyTest {
    public static void main(String[] args) {
        ICommentService commentService = (ICommentService) MyLoggerProxy.getProxy(new CommentService());
        commentService.getComments(3);
        commentService.createComment(new Comment());
        commentService.clearComments();
    }
}
