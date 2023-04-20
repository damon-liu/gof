package com.damon.gof.create.factory.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:19
 */
public class CarFactory {

    private static final Map<String, ICar> carMap = new HashMap<>();

    static {
        carMap.put("BYD", new BydCar());
        carMap.put("TSL", new TslCar());
        carMap.put("ZEEKR", new ZeekrCar());
    }

    public static ICar getCar(String carType) {
        return carMap.get(carType);
    }

    // public static Car getCar(String carType) {
    //     if ("BYD".equals(carType)) {
    //         return new BydCar();
    //     } else if ("TSL".equals(carType)) {
    //         return new TslCar();
    //     } else if ("ZEEKR".equals(carType)) {
    //         return new ZeekrCar();
    //     } else {
    //         return null;
    //     }
    // }
}
