package com.damon.gof.behavior.strategy.pay;


import lombok.Data;

/**
 * @description: 带银行账户的支付上下文
 *
 * @author: damon.liu
 * @createDate: 2020/1/4
 */
@Data
public class PayContextWithAccount extends PayContext{

    /**
     * 银行账户
     */
    private String account;

    public PayContextWithAccount(String username, double money, PayStrategy payStrategy, String account) {
        super(username, money, payStrategy);
        this.account = account;
    }
}
