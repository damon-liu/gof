package com.damon.gof.create.factory.simple;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:25
 */
public class SimpleFactoryDemo {

    public static void main(String[] args) {
        ICar car = CarFactory.getCar("ZEEKR");
        car.create();
    }
}
