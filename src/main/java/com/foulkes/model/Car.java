package com.foulkes.model;

import java.util.List;
import java.util.Set;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public interface Car {

    List<Wheel> getWheels();

    Transmission getTransmission();

    Engine getEngine();

    Set<Door> getDoors();

    String getColour();

    CarType getType();
}
