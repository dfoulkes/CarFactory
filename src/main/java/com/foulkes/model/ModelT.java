package com.foulkes.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class ModelT {

    private List<Door> doors = new ArrayList<Door>();
    private List<Wheel> wheels = new ArrayList<Wheel>();
    Transmission manual = Transmission.MANUAL;

    public List<Wheel> getWheels() {
    	for (int i = 1; i < 5; i++){
    		wheels.add(new WheelImp());
    	}
    	System.out.println(wheels.size());
        return wheels;
    }

    public Transmission getTransmission() {
        return manual;
    }

    public Engine getEngine() {
        return new Engine();
    }

    public List<Door> getDoors() {
    	doors.add(new Door(DoorType.FRONT_LEFT));
    	doors.add(new Door(DoorType.FRONT_RIGHT));
    	doors.add(new Door(DoorType.REAR_LEFT));
    	doors.add(new Door(DoorType.REAR_RIGHT));
    	
    	return doors;
    }


    public String getColour() {
    	String color = "BLACK";
        return color;
    }
}
