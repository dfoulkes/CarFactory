package com.foulkes.factory;

import com.foulkes.model.*;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: PACKAGE_NAME
 */
public class CarFactoryImpl implements CarFactory{


    public ModelT produce(String colour, CarType model, Transmission transmission) {

        ModelT.ModelTBuilder modelTBuilder = new ModelT.ModelTBuilder();
        ModelT car = modelTBuilder.withColour(colour)
                        .withDoor(new Door.DoorBuilder().withDoorType(DoorType.BOOT).build())
                        .withDoor(new Door.DoorBuilder().withDoorType(DoorType.LEFT_BACK).build())
                        .withDoor(new Door.DoorBuilder().withDoorType(DoorType.RIGHT_BACK).build())
                        .withDoor(new Door.DoorBuilder().withDoorType(DoorType.LEFT_FRONT).build())
                        .withDoor(new Door.DoorBuilder().withDoorType(DoorType.RIGHT_FRONT).build())
                        .withWheels(new ThreeSpoke().wheelBuilder(),4)
                        .withCarType(CarType.MODELT)
                        .withTransmission(Transmission.MANUAL)
                        .withEngine(new Engine.Builder().withEngineSize(1.0).build())
                        .build();

        return car;
    }
}
