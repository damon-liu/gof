package com.damon.gof.create.factory.simple;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:15
 */
public class ZeekrCar implements ICar {

    @Override
    public void create() {
        System.out.println("生产极氪！");
    }

}
