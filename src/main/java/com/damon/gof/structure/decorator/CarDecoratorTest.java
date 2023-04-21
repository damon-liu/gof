package com.damon.gof.structure.decorator;

import com.damon.gof.structure.decorator.car.BenzCar;
import com.damon.gof.structure.decorator.car.BmwCar;
import com.damon.gof.structure.decorator.car.ICar;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-21 3:12
 */
public class CarDecoratorTest {

    public static void main(String[] args) {
        ICar benzCar = new BenzCar();
        ICar bmwCar = new BmwCar();
        //创建自动驾驶的奔驰汽车
        // CarDecorator autoBenzCar = new AutoCarDecorator(benzCar);
        // autoBenzCar.run();

        FlyCarDecorator flyCarDecorator = new FlyCarDecorator(new AutoCarDecorator(bmwCar));
        flyCarDecorator.run();

    }
}
