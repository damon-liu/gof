package com.damon.gof.structure.decorator;

import com.damon.gof.structure.decorator.car.ICar;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-21 3:09
 */
public class AutoCarDecorator extends CarDecorator{

    public AutoCarDecorator(ICar decoratedCar){
        super(decoratedCar);
    }

    @Override
    public void run(){
        decoratedCar.run();
        System.out.println("开启自动驾驶");
    }

}
