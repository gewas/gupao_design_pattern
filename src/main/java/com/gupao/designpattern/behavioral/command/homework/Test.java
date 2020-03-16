package com.gupao.designpattern.behavioral.command.homework;

import com.gupao.designpattern.behavioral.command.homework.command.FtpDownloadCommand;
import com.gupao.designpattern.behavioral.command.homework.command.FtpListCommand;
import com.gupao.designpattern.behavioral.command.homework.command.FtpUploadCommand;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 21:07
 */
public class Test {
    public static void main(String[] args) {
        FtpServer server = new FtpServer("localhost");
        FtpClient client = new FtpClient();
        client.execute(new FtpUploadCommand(server));
        client.execute(new FtpListCommand(server));
        client.execute(new FtpDownloadCommand(server));
    }
}
