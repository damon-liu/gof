package com.damon.gof.create.factory.abstract1.car.byd;

import com.damon.gof.create.factory.abstract1.car.ICarModel;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:58
 */
public class HanCar implements ICarModel {

    @Override
    public void produce() {
        System.out.println("汉生产！");
    }

    @Override
    public void test() {
        System.out.println("汉测试！");
    }

    @Override
    public void sale() {
        System.out.println("汉售卖，价格23W！");
    }

    @Override
    public void afterSales() {
        System.out.println("汉售后，三电终身质保！");
    }
}
