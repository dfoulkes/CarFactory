package test;

import com.mycompany.carfactoryassignment.CarFactory;
import com.mycompany.carfactoryassignment.CarFactoryInitial;
import com.mycompany.carfactoryassignment.ModelIt;
import com.mycompany.carfactoryassignment.Transmission;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *
 * @author Shaksham Kapoor
 */
public class CarFactoryTest 
{
    CarFactory carFactory;
    ModelIt carmodel;

    @Before
    public void setup(){
        carFactory = new CarFactoryInitial();
        carmodel = carFactory.produce();
    }


    @Test
    public void carShouldHaveFourWheels(){
        assertThat(carmodel.getWheels().getCarwheels(), is(4));
    }

    @Test
    public void allCarWheelsShouldBeThirtyCm(){
        assertThat(carmodel.getDiameter().getCarDia(), is(4));
    }


    @Test
    public void shouldHaveManualTransmission(){
        assertThat(carmodel.getTrans(), is(Transmission.MANUAL));
    }

    @Test
    public void shouldHaveTheCorrectEngineSize(){
        assertThat(carmodel.getEngine().getEngCapacity(), is(1.0));
    }

    @Test
    public void shouldHaveFiveDoors(){
        assertThat(carmodel.getDoors().getCarDoors(), is(5));
    }

    @Test
    public void shouldBeBlack(){
        assertThat(carmodel.getColor().getCarColor(), is("BLACK"));
    }
}
