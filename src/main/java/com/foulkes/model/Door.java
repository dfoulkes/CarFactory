package com.foulkes.model;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class Door {

    private String colour;
    private DoorSide doorType;

    public Door(String colour, DoorSide doorType) {
        this.colour = colour;
        this.doorType = doorType;
    }

    public String getColour() {
        return colour;
    }

    public DoorSide getDoorType() {
        return doorType;
    }

    @Override
    public int hashCode(){
        return doorType.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Door){
            getDoorType().equals(((Door) o).getDoorType());
        }
        return false;
    }

    public static class DoorBuilder {
        String colour;
        DoorSide doorType;

        public DoorBuilder withDoorType(DoorSide doorType){
            this.doorType = doorType;
            return this;
        }

        public DoorBuilder withColour(String colour){
            this.colour = colour;
            return this;
        }

        public Door build(){
            return new Door(colour, doorType);
        }

    }

}
