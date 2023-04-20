package com.damon.gof.behavior.strategy.pay;

import java.util.List;

/**
 * @description: 支付策略接口
 *
 * @author: damon.liu
 * @createDate: 2020/1/4
 */
public interface PayStrategy {

    /**
     * 支付类型
     *
     * @return
     */
    List<Integer> payType();

    /**
     * 在支付策略接口的支付方法中含有支付上下文作为参数，以便在具体的支付策略中回调上下文中的方法获取数据
     *
     * @param ctx 上下文
     */
    void pay(PayContext ctx);

}
