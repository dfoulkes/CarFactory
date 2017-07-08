package com.foulkes.factory;

import com.foulkes.model.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.factory
 */
public class ModelWFactory implements CarFactory {

    @Override
    public Car produce(String colour, CarType model, Transmission transmission) {
        return new ModelW.Builder().withCarType(model)
                            .withColour(colour)
                            .withDoors(generateDoors(colour))
                            .withTransmission(transmission)
                            .withWheels(getWheels())
                            .withEngine(new Engine.Builder().withEngineSize(1.8).build())
                            .build();
    }

    private List<Wheel> getWheels(){
        ArrayList<Wheel> wheels = new ArrayList<>();
        wheels.add(new ThreeSpoke());
        wheels.add(new ThreeSpoke());
        wheels.add(new ThreeSpoke());
        wheels.add(new ThreeSpoke());
        return wheels;
    }

    private Set<Door> generateDoors(String colour){
        HashSet<Door> doors = new HashSet<>();
        doors.add(new Door(colour, DoorType.CENTRE_LEFT));
        doors.add(new Door(colour, DoorType.CENTRE_RIGHT));

        doors.add(new Door(colour, DoorType.RIGHT_FRONT));
        doors.add(new Door(colour, DoorType.LEFT_FRONT));
        doors.add(new Door(colour, DoorType.RIGHT_BACK));
        doors.add(new Door(colour, DoorType.LEFT_BACK));
        doors.add(new Door(colour, DoorType.BOOT));
        return doors;
    }
}
