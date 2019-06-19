import dealership.cars.Car;
import dealership.cars.ElectricCar;
import dealership.cars.EngineType;
import dealership.cars.TyreType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

   ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(12000, "Blue", TyreType.SPIKY, EngineType.ROCKET);
    }


    @Test
    public void getPrice() {
        assertEquals(12000, electricCar.getPrice());
    }

    @Test
    public void setPrice() {
        electricCar.setPrice(13000);
        assertEquals(13000, electricCar.getPrice());
    }

    @Test
    public void getColour() {
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void setColour() {
        electricCar.setColour("Red");
        assertEquals("Red", electricCar.getColour());
    }

    @Test
    public void getTyreType() {
        assertEquals(TyreType.SPIKY, electricCar.getTyreType());
    }

    @Test
    public void setTyreType() {
        electricCar.setTyreType(TyreType.SOFT);
        assertEquals(TyreType.SOFT, electricCar.getTyreType());
    }

    @Test
    public void getEngineType() {
        assertEquals(EngineType.ROCKET, electricCar.getEngineType());
    }

    @Test
    public void setEngineType() {
        electricCar.setEngineType(EngineType.DIESEL);
        assertEquals(EngineType.DIESEL, electricCar.getEngineType());
    }
}
