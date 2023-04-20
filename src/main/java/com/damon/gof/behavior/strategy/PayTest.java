package com.damon.gof.behavior.strategy;

import com.damon.gof.behavior.strategy.pay.*;

/**
 * @description: 支付策略测试
 * @author: damon.liu
 * @createDate: 2020/1/4
 */
public class PayTest {

    public static void main(String[] args) {
        //创建具体的支付策略
        PayStrategy rmbStrategy = new RmbPay();
        PayStrategy dollarStrategy = new DollarPay();
        // this.payStrategy = this.payStrategyList.stream().filter(x -> x.payType().contains(payType)).findFirst().get();
        //准备小王的支付上下文
        PayContext ctx = new PayContext("小王", 30000, rmbStrategy);
        //向小王支付工资
        ctx.pay();



        //准备Jack的支付上下文
        ctx = new PayContext("jack", 10000, dollarStrategy);
        //向Jack支付工资
        ctx.pay();

        //创建支付到银行账户的支付策略
        PayStrategy accountStrategy = new AccountPay();
        //准备带有银行账户的上下文
        ctx = new PayContextWithAccount("小张",40000,accountStrategy,"1234567890");
        //向小张的账户支付
        ctx.pay();

    }

}
