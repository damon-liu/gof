package com.damon.gof.create.factory.simple;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:09
 */
public class TslCar implements ICar {
    
    @Override
    public void create() {
        System.out.println("生产特斯拉！");
    }
}
