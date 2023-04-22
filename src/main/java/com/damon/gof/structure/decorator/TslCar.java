package com.damon.gof.structure.decorator;

import com.damon.gof.structure.decorator.car.ICar;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-21 3:07
 */
public class TslCar implements ICar {

    @Override
    public void run() {
        System.out.println("特斯拉开车了！");
    }

}
