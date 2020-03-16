package com.gupao.designpattern.behavioral.command.homework;

import com.gupao.designpattern.behavioral.command.homework.command.FtpCommand;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 21:07
 */
public class FtpClient {

    public void execute(FtpCommand command) {
        command.execute();
    }

}
