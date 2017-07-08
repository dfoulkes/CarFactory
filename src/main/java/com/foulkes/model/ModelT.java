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
public class ModelT  implements Car{

    public static final String BLACK = "black";
    private Set<Door> doors;
    private Engine engine;
    private String colour;
    private Transmission transmission;
    private List<Wheel> wheels;
    private CarType carType;

    public ModelT(){
    }


    @Override
    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public Set<Door> getDoors() {
        return doors;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public CarType getType() {
        return carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
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
        private Set<Door> doors = new HashSet<>();
        private List<Wheel> wheels = new ArrayList<>();
        private Transmission transmission;
        private String colour;
        private Engine engine;
        private CarType carType;

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

        public ModelTBuilder withCarType(CarType carType){
            this.carType = carType;
            return this;
        }

        public ModelT build(){
            ModelT modelT = new ModelT();
            modelT.setEngine(engine);
            modelT.setDoors(doors);
            modelT.setColour(colour);
            modelT.setTransmission(transmission);
            modelT.setWheels(wheels);
            modelT.setCarType(carType);
            return modelT;
        }


    }
}
