package com.gupao.designpattern.proxy.analysis;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/2 13:34
 */
public class CommentService implements ICommentService {
    @Override
    public Comment updateComment(long id, String comment) {
        System.out.println("updateComment()");
        return new Comment();
    }

    @Override
    public List<Comment> getComments(long newsId) {
        System.out.println("getComments()");
        List<Comment> l = new ArrayList<>(8);
        Comment c = new Comment();
        c.setComment("aaaa");
        c.setCommentTs(Timestamp.from(Instant.now()));
        c.setNewsId(22);
        c.setUserId(2);
        l.add(c);
        return l;
    }

    @Override
    public void clearComments() {
        System.out.println("clearComments()");
    }

    @Override
    public void createComment(Comment comment) {
        System.out.println("createComment()");
        System.out.println(comment);
    }
}
