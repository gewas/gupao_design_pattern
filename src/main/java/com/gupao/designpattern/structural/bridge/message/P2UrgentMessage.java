package com.gupao.designpattern.structural.bridge.message;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:27
 */
public class P2UrgentMessage extends AbstractUrgentMessage {
    public P2UrgentMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendUrgentMessage(String content, String to) {
        message.sendMessage("[P2] " + content, to);
    }
}
