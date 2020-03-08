package com.gupao.designpattern.structural.adapter.thirdlogin.v2;

/**
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 0:06
 */
public class Test {
    public static void main(String[] args) {
        TikTokLoginAdapterDecorator tikTokLoginAdapter = new TikTokLoginAdapterDecorator(new LoginAdapter());
        tikTokLoginAdapter.loginTikTok("tiktokasdasdasdasdasdasd213ewde");
    }
}
