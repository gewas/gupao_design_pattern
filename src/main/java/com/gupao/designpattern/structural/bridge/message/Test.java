package com.gupao.designpattern.structural.bridge.message;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:29
 */
public class Test {
    public static void main(String[] args) {
        AbstractUrgentMessage p1Msg = new P1UrgentMessage(new EmailMessage());
        AbstractUrgentMessage p2Msg = new P2UrgentMessage(new SmsMessage());

        p1Msg.sendUrgentMessage("WE NEED A NEW IMPORTANT FUNCTION!!!", "CTO");
        p2Msg.sendUrgentMessage("WE NEED A NEW FUNCTION!!!", "DEV LEAD");

    }
}
