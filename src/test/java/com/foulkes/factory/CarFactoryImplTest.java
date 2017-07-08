package com.foulkes.factory;

import com.foulkes.model.ModelT;
import com.foulkes.model.DoorType;
import com.foulkes.model.Transmission;
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

    CarFactory carFactory;
    ModelT modelT;

    @Before
    public void setup(){
        carFactory = new CarFactoryImpl();
        modelT = carFactory.produce();
    }


    @Test
    public void carShouldHaveFourWheels(){
        assertThat(modelT.getWheels().size(), is(4));
    }

    @Test
    public void allCarWheelsShouldBeThirtyCm(){
        assertThat(modelT.getWheels()
                .stream()
                    .filter(wheel -> wheel.getSize().equals(30))
                        .collect(toList()).size(), is(4));
    }


    @Test
    public void shouldHaveManualTransmission(){
        assertThat(modelT.getTransmission(), is(Transmission.MANUAL));
    }

    @Test
    public void shouldHaveTheCorrectEngineSize(){
        assertThat(modelT.getEngine().getEngineSize(), is(1.0));
    }

    @Test
    public void shouldHaveFiveDoors(){
        assertThat(modelT.getDoors().size(), is(5));
    }

    @Test
    public void shouldBeBlack(){
        assertThat(modelT.getColour(), is("BLACK"));
    }


    @Test
    public void shouldContainUniqueDoors(){
        Set<DoorType> identifiedDoors = new HashSet<>();
        modelT.getDoors().stream().map(d -> d.getDoorType()).forEach(doorType -> identifiedDoors.add(doorType));
        assertThat(identifiedDoors.size(), is(5));
    }


}