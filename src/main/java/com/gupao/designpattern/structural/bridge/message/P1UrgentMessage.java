package com.gupao.designpattern.structural.bridge.message;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:27
 */
public class P1UrgentMessage extends AbstractUrgentMessage {
    public P1UrgentMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendUrgentMessage(String content, String to) {
        message.sendMessage("[P1] " + content, to);
    }
}
