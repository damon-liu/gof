package com.damon.gof.behavior.responsibility.handler1.handler.impl;

import com.damon.gof.behavior.responsibility.handler1.handler.Handler;

public class HandlerA extends Handler {

    @Override
    protected void doHandle() {
        System.out.println("A执行器执行！");
    }

}
