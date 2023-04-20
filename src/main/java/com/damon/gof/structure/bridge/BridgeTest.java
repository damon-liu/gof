package com.damon.gof.structure.bridge;

import com.damon.gof.structure.bridge.notification.NotificationAbstract;
import com.damon.gof.structure.bridge.notification.impl.SevereNotification;
import com.damon.gof.structure.bridge.sender.impl.EmailMsgSender;
import com.damon.gof.structure.bridge.sender.impl.TelephoneMsgSender;
import com.google.common.collect.Lists;

/**
 * Description:一个类存在两个（或多个）独立变化的维度，我们通过组合的方式，让这两个（或多个）维度可以独立进行扩展（“组合优于继承”设计原则） 将抽象和实现解耦，让它们可以独立变化
 *
 * 根据不同的告警规则，触发不同类型的告警。
 * 告警支持多种通知渠道，包括：邮件、短信、微信、自动语音电话。
 * 通知的紧急程度有多种类型，包括：SEVERE（严重）、URGENCY（紧急）、NORMAL（普通）、TRIVIAL（无关紧要）。不
 * 同的紧急程度对应不同的通知渠道。比如，SERVE（严重）级别的消息会通过“自动语音电话 + 短信”告知相关人员。
 *
 * @author damon.liu
 * Date 2023-04-20 6:54
 */
public class BridgeTest {

    public static void main(String[] args) {
        NotificationAbstract notificationAbstract = new SevereNotification(Lists.newArrayList(new EmailMsgSender(), new TelephoneMsgSender()));
        notificationAbstract.notify("发送消息");
    }
}
