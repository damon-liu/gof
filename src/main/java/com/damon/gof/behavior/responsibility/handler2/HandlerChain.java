package com.damon.gof.behavior.responsibility.handler2;

import com.damon.gof.behavior.responsibility.handler2.handler.IHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-19 14:30
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle(Map<String, Object> map) {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle(map);
            if (handled) {
                break;
            }
        }
    }
}
