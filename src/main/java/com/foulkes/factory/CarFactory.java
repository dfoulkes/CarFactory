package com.foulkes.factory;

import com.foulkes.model.Car;
import com.foulkes.model.CarType;
import com.foulkes.model.Transmission;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.factory
 */
public interface CarFactory {

     Car produce(String colour, CarType model, Transmission automatic);
}
