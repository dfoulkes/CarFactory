package com.foulkes.model;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class Door {

    DoorType doorType;
    public Door(DoorType doorType){
    	this.doorType = doorType;
    }

    public DoorType getDoorType() {
        return doorType;
    }
}
