package com.damon.gof.structure.decorator;

import com.damon.gof.structure.decorator.car.BenzCar;
import com.damon.gof.structure.decorator.car.BmwCar;
import com.damon.gof.structure.decorator.car.ICar;

/**
 * Description:
 * <p>
 * 装饰者模式与代理模式的区别：
 * 两者都是对类的方法进行增强，但装饰器模式强调的是增强自身，在被装饰之后你能够够在被增强的类上使用增强后的方法。增强过后还是你，只不过能力变强了。
 * 而代理模式则强调要别人帮你去做一些本身与你业务没有太多关系的职责。
 * 代理模式是为了实现对象的控制，因为被代理的对象往往难以直接获得或者是其内部不想暴露出来。
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
