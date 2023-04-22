package com.damon.gof.structure.decorator.car;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-21 3:07
 */
public class BmwCar implements ICar{

    @Override
    public void run() {
        System.out.println("宝马开车了！");
    }

}
