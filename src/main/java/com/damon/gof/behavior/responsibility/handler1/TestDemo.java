package com.damon.gof.behavior.responsibility.handler1;

import com.damon.gof.behavior.responsibility.handler1.handler.impl.HandlerA;
import com.damon.gof.behavior.responsibility.handler1.handler.impl.HandlerB;

/**
 * Description: 职责链模式的一种变体，请求会被所有的处理器都处理一遍，不存在中途终止的情况。
 *
 * @author damon.liu
 * Date 2023-04-19 14:41
 */
public class TestDemo {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }

}
