package com.damon.gof.structure.proxy;

/**
 * Description:在不改变原始类（或者叫被代理类）代码的情况下，通过引入代理类来给原始类附加功能。
 * 代理模式在平时的开发经常被用到，常用在业务系统中开发一些非功能性需求，比如：监控、统计、鉴权、限流、事务、幂等、日志
 *
 * @author damon.liu
 * Date 2023-04-20 6:20
 */
public class ProxyDemo {

    public static void main(String[] str){
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        UserService userService = (UserService) proxy.createProxy(new UserServiceImpl());
        userService.login("13255", "0000");
    }
}
