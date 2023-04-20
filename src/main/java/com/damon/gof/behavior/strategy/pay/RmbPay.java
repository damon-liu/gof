package com.damon.gof.behavior.strategy.pay;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: 人民币支付策略
 * @author: damon.liu
 * @createDate: 2020/1/4
 */
@Service
public class RmbPay implements PayStrategy {

    @Override
    public List<Integer> payType() {
        return Stream.of(0, 1).collect(Collectors.toList());
    }

    @Override
    public void pay(PayContext ctx) {
        System.out.println("现在给：" + ctx.getUsername() + " 人民币支付 " + ctx.getMoney() + "元！");
    }

}
