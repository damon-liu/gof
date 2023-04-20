package com.damon.gof.create.factory.abstract1.factory;

import com.damon.gof.create.factory.abstract1.car.ICarModel;
import com.damon.gof.create.factory.abstract1.car.byd.HanCar;
import com.damon.gof.create.factory.abstract1.car.byd.TangCar;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:40
 */
public class BydFactory implements ICarFactory {

    private static final Map<String, ICarModel> carModelMap = new HashMap<>();

    static {
        carModelMap.put("汉", new HanCar());
        carModelMap.put("唐", new TangCar());
    }

    @Override
    public ICarModel getCarModel(String type) {
        return carModelMap.get(type);
    }
}
