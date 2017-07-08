package com.foulkes.factory;

import com.foulkes.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 */
public class CarFactoryImpl implements CarFactory{

    Map<CarType, CarFactory> factoryTypes = new HashMap<>();


    public CarFactoryImpl(){
        factoryTypes.put(CarType.MODELT, new ModelTFactory());
        factoryTypes.put(CarType.MODELW, new ModelWFactory());
    }

    public Car produce(String colour, CarType model, Transmission transmission) {
        return getFactory(model).produce(colour,model,transmission);
    }

    private CarFactory getFactory(CarType carType){
        return factoryTypes.get(carType);
    }
}
