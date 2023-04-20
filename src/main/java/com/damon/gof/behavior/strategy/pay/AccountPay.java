package com.damon.gof.behavior.strategy.pay;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: 银行账户支付
 * @author: damon.liu
 * @createDate: 2020/1/4
 */
@Service
public class AccountPay implements PayStrategy {

    @Override
    public List<Integer> payType() {
        return Stream.of(5).collect(Collectors.toList());
    }

    @Override
    public void pay(PayContext ctx) {
        PayContextWithAccount ctxAccount = (PayContextWithAccount) ctx;
        System.out.println("现在给：" + ctxAccount.getUsername() + "的账户：" + ctxAccount.getAccount() + " 支付工资："
                + ctxAccount.getMoney() + " 元！");
    }
}
