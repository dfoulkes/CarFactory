package com.foulkes.factory;

import com.foulkes.model.Car;
import com.foulkes.model.Transmission;
import org.junit.Before;
import org.junit.Test;

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
    Car car;

    @Before
    public void setup(){
        carFactory = new CarFactoryImpl();
        car  = carFactory.produce();
    }


    @Test
    public void carShouldHaveFourWheels(){
        assertThat(car.getWheels().size(), is(4));
    }

    @Test
    public void allCarWheelsShouldBeThirtyCm(){
        assertThat(car.getWheels()
                .stream()
                    .filter(wheel -> wheel.getSize().equals(30))
                        .collect(toList()).size(), is(4));
    }


    @Test
    public void shouldHaveManualTransmission(){
        assertThat(car.getTransmission(), is(Transmission.MANUAL));
    }

    @Test
    public void shouldHaveTheCorrectEngineSize(){
        assertThat(car.getEngine().getEngineSize(), is(1.4));
    }

    @Test
    public void shouldHaveFiveDoors(){
        assertThat(car.getDoors().size(), is(5));
    }

}