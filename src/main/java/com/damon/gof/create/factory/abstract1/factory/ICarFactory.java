package com.damon.gof.create.factory.abstract1.factory;

import com.damon.gof.create.factory.abstract1.car.ICarModel;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 1:41
 */
public interface ICarFactory {

    public ICarModel getCarModel(String type);

}
