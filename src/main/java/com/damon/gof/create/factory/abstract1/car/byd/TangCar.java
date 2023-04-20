package com.damon.gof.create.factory.abstract1.car.byd;

import com.damon.gof.create.factory.abstract1.car.ICarModel;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:58
 */
public class TangCar implements ICarModel {

    @Override
    public void produce() {
        System.out.println("唐生产！");
    }

    @Override
    public void test() {

    }

    @Override
    public void sale() {

    }

    @Override
    public void afterSales() {

    }
}
