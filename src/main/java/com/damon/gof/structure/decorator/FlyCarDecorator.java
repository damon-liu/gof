package com.damon.gof.structure.decorator;

import com.damon.gof.structure.decorator.car.ICar;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-21 3:09
 */
public class FlyCarDecorator extends CarDecorator{

    public FlyCarDecorator(ICar decoratedCar){
        super(decoratedCar);
    }

    @Override
    public void run(){
        decoratedCar.run();
        autoRun();
    }

    private void autoRun(){
        System.out.println("开启飞行模式");
    }
    
}
