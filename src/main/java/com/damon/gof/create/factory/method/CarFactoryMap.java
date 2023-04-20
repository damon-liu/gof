package com.damon.gof.create.factory.method;


import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:50
 */
public class CarFactoryMap {

    private static final Map<String, ICarFactory> carFactoryMap = new HashMap<>();

    static {
        carFactoryMap.put("BYD", new BydFactory());
        carFactoryMap.put("TSL", new TslFactory());
    }

    public static ICarFactory getCarFactory(String carFactoryType) {
        return carFactoryMap.get(carFactoryType);
    }
}
