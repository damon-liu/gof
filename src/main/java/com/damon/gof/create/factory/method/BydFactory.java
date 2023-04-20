package com.damon.gof.create.factory.method;

import com.damon.gof.create.factory.simple.BydCar;
import com.damon.gof.create.factory.simple.ICar;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 2:28
 */
public class BydFactory implements ICarFactory{

    @Override
    public ICar crate() {
        System.out.println("生产BYD！");
        return new BydCar();
    }
}
