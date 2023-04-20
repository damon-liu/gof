package com.damon.gof.behavior.responsibility.handler2.handler.impl;

import com.damon.gof.behavior.responsibility.handler2.handler.IHandler;

import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-19 14:38
 */
public class HandlerA implements IHandler {

    @Override
    public boolean handle(Map<String, Object> map) {
        System.out.println("A执行器执行！");
        return true;
    }

}
