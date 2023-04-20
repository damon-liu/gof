package com.damon.gof.behavior.responsibility.handler2.handler.impl;

import com.damon.gof.behavior.responsibility.handler2.handler.IHandler;

import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-19 14:40
 */
public class HandlerB implements IHandler {

    @Override
    public boolean handle(Map<String, Object> map) {
        System.out.println("B执行器执行！");
        return false;
    }
}
