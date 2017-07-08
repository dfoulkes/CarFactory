package com.foulkes.factory;

import com.foulkes.model.ModelT;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.factory
 */
public interface CarFactory {

     ModelT produce(String colour);
}
