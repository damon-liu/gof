package com.damon.gof.behavior.strategy;

import com.damon.gof.behavior.strategy.pay.AccountPay;
import com.damon.gof.behavior.strategy.pay.PayContext;
import com.damon.gof.behavior.strategy.pay.PayContextWithAccount;
import com.damon.gof.behavior.strategy.pay.PayStrategy;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 策略模式
 * @author: damon.liu
 * @createDate: 2020/1/4
 */
@Api("策略模式")
@RestController
@RequestMapping("/strategy")
public class PayController {

    @Autowired
    private List<PayStrategy> payStrategyList;

    @Autowired
    private List<AccountPay> accountPayList;

    @GetMapping(value = "/pay/{payType}")
    @ApiOperation(value = "多币种支付")
    public String pay(@PathVariable Integer payType){
        PayStrategy payStrategy = this.payStrategyList.stream().filter(x -> x.payType().contains(payType)).findFirst().get();
        //准备小王的支付上下文
        PayContext ctx = new PayContext("小王", 30000, payStrategy);
        //向小王支付工资
        ctx.pay();
        return "支付成功！";
    }

    @GetMapping(value = "/pay/account/{account}")
    @ApiOperation(value = "多币种支付")
    public String payAccount(@PathVariable String account){
        AccountPay accountPay = this.accountPayList.stream().filter(x -> x.payType().contains(5)).findFirst().get();
        //准备小王的支付上下文
        PayContextWithAccount ctx = new PayContextWithAccount("小王", 30000, accountPay, account);
        //向小王支付工资
        ctx.pay();
        return "支付成功！";
    }
}
