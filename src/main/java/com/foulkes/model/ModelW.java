package com.foulkes.model;

import java.util.List;
import java.util.Set;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class ModelW implements Car {

    private Set<Door> doors;
    private Engine engine;
    private String colour;
    private Transmission transmission;
    private List<Wheel> wheels;
    private CarType carType;


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

    public static class Builder{

        private Set<Door> doors;
        private Engine engine;
        private String colour;
        private Transmission transmission;
        private List<Wheel> wheels;
        private CarType carType;

        public Builder withDoors(Set<Door> doors) {
            this.doors = doors;
            return this;
        }

        public Builder withEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder withColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder withTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder withWheels(List<Wheel> wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder withCarType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public ModelW build(){
            ModelW car = new ModelW();
            car.setCarType(carType);
            car.setColour(colour);
            car.setDoors(doors);
            car.setEngine(engine);
            car.setTransmission(transmission);
            car.setWheels(wheels);
            return car;
        }
    }
}
