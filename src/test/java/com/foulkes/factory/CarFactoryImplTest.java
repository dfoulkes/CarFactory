package com.foulkes.factory;

import com.foulkes.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.factory
 */
public class CarFactoryImplTest {

    private static final String BLUE = "BLUE";
    private static final String BLACK = "BLACK";
    private static final String RED = "RED";
    private CarFactory carFactory;
    private Car modelT;

    @Before
    public void setup(){
        carFactory = new CarFactoryImpl();
        setupModelT();
    }

    private void setupModelT(){
        modelT = carFactory.produce(BLACK, CarType.MODELT, Transmission.MANUAL);
    }


    @Test
    public void modelTCarShouldHaveFourWheels(){
        assertThat(modelT.getWheels().size(), is(4));
    }

    @Test
    public void modelTAllCarWheelsShouldBeThirtyCm(){
        assertThat(modelT.getWheels()
                .stream()
                    .filter(wheel -> wheel.getSize().equals(30))
                        .collect(toList()).size(), is(4));
    }


    @Test
    public void modelTShouldHaveManualTransmission(){
        assertThat(modelT.getType(), is(CarType.MODELT));
        assertThat(modelT.getTransmission(), is(Transmission.MANUAL));
    }

    @Test
    public void modelTShouldHaveTheCorrectEngineSize(){
        assertThat(modelT.getType(), is(CarType.MODELT));
        assertThat(modelT.getEngine().getEngineSize(), is(1.0));
    }

    @Test
    public void modelTShouldHaveFiveDoors(){
        assertThat(modelT.getType(), is(CarType.MODELT));
        assertThat(modelT.getDoors().size(), is(5));
    }

    @Test
    public void modelTShouldBeBlack(){
        assertThat(modelT.getType(), is(CarType.MODELT));
        assertThat(modelT.getColour(), is(BLACK));
    }

    @Test
    public void modelTShouldBeBlue(){
        modelT = carFactory.produce(BLUE, CarType.MODELT, Transmission.AUTOMATIC);
        assertThat(modelT.getType(), is(CarType.MODELT));
        assertThat(modelT.getColour(), is(BLUE));
    }

    @Test
    public void modelTShouldBeRed(){
        modelT = carFactory.produce(RED, CarType.MODELT, Transmission.AUTOMATIC);
        assertThat(modelT.getType(), is(CarType.MODELT));
        assertThat(modelT.getColour(), is(RED));
    }


    @Test
    public void modelTShouldContainUniqueDoors(){
        Set<DoorType> identifiedDoors = new HashSet<>();
        modelT.getDoors().stream().map(Door::getDoorType).forEach(identifiedDoors::add);
        assertThat(modelT.getType(), is(CarType.MODELT));
        assertThat(identifiedDoors.size(), is(5));
    }

    @Test
    public void modelTShouldNotAllowAutomaticTransmission(){
        Car car = carFactory.produce(RED, CarType.MODELT, Transmission.AUTOMATIC);
        assertThat(car.getType(), is(CarType.MODELT));
        assertThat(car.getTransmission(), is(Transmission.MANUAL));
    }

    @Test
    public void modelWShouldHaveSevenDoors(){
        Car car = carFactory.produce(RED, CarType.MODELW, Transmission.AUTOMATIC);
        assertThat(car.getType(), is(CarType.MODELW));
        assertThat(car.getDoors().size(), is(7));
    }

    @Test
    public void modelWShouldAllowManualTransmission(){
        Car car = carFactory.produce(RED, CarType.MODELW, Transmission.MANUAL);
        assertThat(car.getType(), is(CarType.MODELW));
        assertThat(car.getTransmission(), is(Transmission.MANUAL));
    }

    @Test
    public void modelWShouldAllowAutomaticTransmission(){
        Car car = carFactory.produce(RED, CarType.MODELW, Transmission.AUTOMATIC);
        assertThat(car.getType(), is(CarType.MODELW));
        assertThat(car.getTransmission(), is(Transmission.AUTOMATIC));
    }

    @Test
    public void modelWShouldHaveLargeEngine(){
        Car car = carFactory.produce(RED, CarType.MODELW, Transmission.AUTOMATIC);
        assertThat(car.getType(), is(CarType.MODELW));
        assertThat(car.getEngine().getEngineSize(), is(1.8));
    }

    @Test
    public void modelWShouldBeBlack(){
        Car car = carFactory.produce(BLACK, CarType.MODELW, Transmission.AUTOMATIC);
        assertThat(car.getType(), is(CarType.MODELW));
        assertThat(car.getColour(), is(BLACK));
    }

    @Test
    public void modelWShouldBeBlue(){
        Car car = carFactory.produce(BLUE, CarType.MODELW, Transmission.AUTOMATIC);
        assertThat(car.getType(), is(CarType.MODELW));
        assertThat(car.getColour(), is(BLUE));
    }

    @Test
    public void modelWShouldBeRed(){
        Car car = carFactory.produce(RED, CarType.MODELW, Transmission.AUTOMATIC);
        assertThat(car.getType(), is(CarType.MODELW));
        assertThat(car.getColour(), is(RED));
    }

}