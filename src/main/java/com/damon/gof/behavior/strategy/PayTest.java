package com.damon.gof.behavior.strategy;

import com.damon.gof.behavior.strategy.pay.*;

/**
 * @description:
 * 策略类的定义比较简单，包含一个策略接口和一组实现这个接口的策略类
 * 策略的创建由工厂类来完成，封装策略创建的细节
 * 策略模式包含一组策略可选，客户端代码如何选择使用哪个策略，有两种确定方法：编译时静态确定和运行时动态确定。其中，“运行时动态确定”才是策略模式最典型的应用场景。
 *
 * 策略模式和工厂模式区别：
 * 工厂模式
 * 1.目的是创建不同且相关的对象
 * 2.侧重于"创建对象"
 * 3.实现方式上可以通过父类或者接口
 * 4.一般创建对象应该是现实世界中某种事物的映射，有它自己的属性与方法！
 * 策略模式
 * 1.目的实现方便地替换不同的算法类
 * 2.侧重于算法(行为)实现
 * 3.实现主要通过接口
 * 4.创建对象对行为的抽象而非对对象的抽象，很可能没有属于自己的属性。
 *
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
