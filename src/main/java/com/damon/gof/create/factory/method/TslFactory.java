package com.damon.gof.create.factory.method;

import com.damon.gof.create.factory.simple.ICar;
import com.damon.gof.create.factory.simple.TslCar;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 2:28
 */
public class TslFactory implements ICarFactory{

    @Override
    public ICar crate() {
        System.out.println("生产TSL！");
        return new TslCar();
    }
}
