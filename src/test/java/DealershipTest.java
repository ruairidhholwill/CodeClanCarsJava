import dealership.Dealership;
import dealership.behaviours.IDrive;
import dealership.cars.*;
import dealership.person.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class DealershipTest {

    ElectricCar electricCar;
    PetrolCar petrolCar;
    HybridCar hybridCar;
    Dealership dealership;
    Customer customer;

    @Before
    public void before(){
        electricCar = new ElectricCar(5000, "baloo", TyreType.SOFT, EngineType.DIESEL);
        petrolCar = new PetrolCar(10000, "baloo", TyreType.SOFT, EngineType.DIESEL);
        hybridCar = new HybridCar(15000, "baloo", TyreType.SOFT, EngineType.DIESEL);
        customer = new Customer("Kennth", 10000);
        ArrayList<IDrive> carStock = new ArrayList<IDrive>();
        dealership = new Dealership("Ken's Cars", carStock);

        carStock.add(electricCar);
        carStock.add(petrolCar);
        carStock.add(hybridCar);
    }

    @Test
    public void getStockSize(){
        assertEquals(3, dealership.getAllCars().size());
    }

    @Test
    public void aCustomerCanBuyACar(){
        assertEquals(2, dealership.customerCanBuy(customer).size());
    }

}
