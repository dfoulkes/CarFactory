package com.foulkes.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class Car {

    public static final String BLACK = "black";
    List<Door> doors;

    public Car(){
         Door.DoorBuilder builder = new Door.DoorBuilder();
         doors = new ArrayList<>();
         doors.add(builder.withColour(BLACK).withDoorType(DoorSide.BOOT).build());
         doors.add(builder.withColour(BLACK).withDoorType(DoorSide.RIGHT_FRONT).build());
         doors.add(builder.withColour(BLACK).withDoorType(DoorSide.LEFT_FRONT).build());
         doors.add(builder.withColour(BLACK).withDoorType(DoorSide.LEFT_BACK).build());
        doors.add(builder.withColour(BLACK).withDoorType(DoorSide.RIGHT_BACK).build());
    }


    public List<Wheel> getWheels() {
        return null;
    }

    public Transmission getTransmission() {
        return null;
    }

    public Engine getEngine() {
        return null;
    }

    public List<Door> getDoors() {
        return null;
    }


    public String getColour() {
        return "BLACK";
    }
}
