package com.gupao.designpattern.behavioral.command.homework.command;

import com.gupao.designpattern.behavioral.command.homework.FtpServer;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 21:10
 */
public class FtpListCommand implements FtpCommand {

    private FtpServer server;

    public FtpListCommand(FtpServer server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.list();
    }
}
