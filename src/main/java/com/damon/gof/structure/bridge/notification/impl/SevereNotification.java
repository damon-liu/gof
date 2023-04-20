package com.damon.gof.structure.bridge.notification.impl;

import com.damon.gof.structure.bridge.notification.NotificationAbstract;
import com.damon.gof.structure.bridge.sender.MsgSender;

import java.util.List;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 6:48
 */
public class SevereNotification extends NotificationAbstract {

    public SevereNotification(List<MsgSender> msgSenders) {
        super(msgSenders);
    }

    @Override
    public void notify(String message) {
        for (MsgSender msgSender : msgSenderList) {
            msgSender.send(message);
        }
    }
}
