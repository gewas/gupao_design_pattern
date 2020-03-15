package com.gupao.designpattern.behavioral.chainofresponsibility.builder.handler;

/**
 * 责任链 + Builder，
 * 责任链节点和通用版中一致，只维护了next。
 * 通过Builder来维护头尾节点，且builder的链式调用十分符合责任链模式。
 * 由于，连有先后顺序，所以要保证关键节点的顺序是否合理。比如：授权不能先于登录。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:29
 */
public abstract class Handler<T> {

    private Handler<T> next;

    public abstract void doHandle(T t);

    protected Handler<T> getNext() {
        return next;
    }

    private void setNext(Handler<T> next) {
        this.next = next;
    }

    public static class Builder<T> {

        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (head == null) {
                head = handler;
            } else {
                tail.setNext(handler);
            }
            tail = handler;
            return this;
        }

        public Handler<T> build() {
            return head;
        }
    }
}
