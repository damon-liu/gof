package com.damon.gof.create.factory.abstract1.factory;

import com.damon.gof.create.factory.abstract1.car.ICarModel;
import com.damon.gof.create.factory.abstract1.car.tsl.Mode3Car;
import com.damon.gof.create.factory.abstract1.car.tsl.ModeYCar;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:40
 */
public class TslFactory implements ICarFactory {

    private static final Map<String, ICarModel> carModelMap = new HashMap<>();

    static {
        carModelMap.put("mode3", new Mode3Car());
        carModelMap.put("modeY", new ModeYCar());
    }

    @Override
    public ICarModel getCarModel(String type) {
        return carModelMap.get(type);
    }
}
