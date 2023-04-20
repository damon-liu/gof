package com.damon.gof.behavior.responsibility.handler2;

import com.damon.gof.behavior.responsibility.handler2.handler.impl.HandlerA;
import com.damon.gof.behavior.responsibility.handler2.handler.impl.HandlerB;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Description: 处理器链上的某个处理器能够处理这个请求，那就不会继续往下传递请求
 *
 * @author damon.liu
 * Date 2023-04-19 14:41
 */
public class TestDemo {

    public static void main(String[] args) {
        Map<String, Object> map = Maps.newHashMap();
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle(map);
    }

}
