package com.damon.gof.structure.bridge.sender.impl;

import com.damon.gof.structure.bridge.sender.MsgSender;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 6:43
 */
public class EmailMsgSender implements MsgSender {

    @Override
    public void send(String message) {
        System.out.println("发送邮件！");
    }
}
