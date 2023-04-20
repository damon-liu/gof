package com.damon.gof.create.factory.abstract1;

import com.damon.gof.create.factory.abstract1.car.ICarModel;
import com.damon.gof.create.factory.abstract1.factory.CarFactoryMap;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:25
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        ICarModel carModel = CarFactoryMap.getCarFactory("BYD").getCarModel("汉");
        carModel.produce();
        carModel.test();
        carModel.sale();
        carModel.afterSales();
    }
}
