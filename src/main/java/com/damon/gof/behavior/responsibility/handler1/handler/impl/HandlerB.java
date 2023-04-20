package com.damon.gof.behavior.responsibility.handler1.handler.impl;

import com.damon.gof.behavior.responsibility.handler1.handler.Handler;

public class HandlerB extends Handler {

    @Override
    protected void doHandle() {
        System.out.println("B执行器执行！");
    }
    
}
