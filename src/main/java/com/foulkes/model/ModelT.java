package com.foulkes.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class ModelT {

    public static final String BLACK = "black";
    Set<Door> doors;
    Engine engine;
    String colour;
    Transmission transmission;
    List<Wheel> wheels;

    public ModelT(){
    }


    public List<Wheel> getWheels() {
        return wheels;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public Set<Door> getDoors() {
        return doors;
    }

    public String getColour() {
        return "BLACK";
    }

    public void setDoors(Set<Door> doors) {
        this.doors = doors;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public static class  ModelTBuilder {
        Set<Door> doors = new HashSet<>();
        List<Wheel> wheels = new ArrayList<>();
        Transmission transmission;
        String colour;
        Engine engine;

        public ModelTBuilder withColour(String colour){
            this.colour = colour;
            return this;
        }

        public ModelTBuilder withWheels(Wheel wheel, int times){

            for(int i=0; i<times; i++){
                wheels.add(wheel);
            }
            return this;
        }

        public ModelTBuilder withEngine(Engine engine){
            this.engine = engine;
            return this;
        }

        public ModelTBuilder withDoor(Door door){
            doors.add(door);
            return this;
        }

        public ModelTBuilder withTransmission(Transmission transmission){
            this.transmission = transmission;
            return this;
        }

        public ModelT build(){
            ModelT modelT = new ModelT();
            modelT.setEngine(engine);
            modelT.setDoors(doors);
            modelT.setColour(colour);
            modelT.setTransmission(transmission);
            modelT.setWheels(wheels);
            return modelT;
        }


    }
}
