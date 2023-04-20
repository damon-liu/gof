package com.damon.gof.create.factory.method;




/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:25
 */
public class MethodFactoryDemo {

    public static void main(String[] args) {
        CarFactoryMap.getCarFactory("BYD").crate();
    }
}
