package com.damon.gof.structure.bridge.notification;

import com.damon.gof.structure.bridge.sender.MsgSender;

import java.util.List;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 6:47
 */
public abstract class NotificationAbstract {

    protected List<MsgSender> msgSenderList;

    public NotificationAbstract(List<MsgSender> msgSenders) {
        this.msgSenderList = msgSenders;
    }

    public abstract void notify(String message);
}
