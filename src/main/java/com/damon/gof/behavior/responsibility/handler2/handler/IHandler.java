package com.damon.gof.behavior.responsibility.handler2.handler;

import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-19 14:29
 */
public interface IHandler {

    boolean handle(Map<String, Object> map);

}
