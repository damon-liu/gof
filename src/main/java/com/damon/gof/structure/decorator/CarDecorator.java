package com.damon.gof.structure.decorator;

import com.damon.gof.structure.decorator.car.ICar;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-21 3:08
 */
public class CarDecorator implements ICar {

    protected ICar decoratedCar;

    public CarDecorator(ICar decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void run() {
        decoratedCar.run();
    }
}
