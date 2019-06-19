package dealership;

import dealership.behaviours.IBuy;
import dealership.behaviours.IDrive;
import dealership.cars.ElectricCar;
import dealership.person.Customer;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<IDrive> carStock;
    private String name;

    public Dealership(String name, ArrayList<IDrive> carStock){
        this.carStock = carStock;
        this.name = name;
    }

    public ArrayList<IDrive> getAllCars(){
        return carStock;
    }

    public ArrayList customerCanBuy(Customer customer){
        ArrayList<IDrive> canBuy = new ArrayList<IDrive>();
        for(IDrive car : this.carStock){
            if (car instanceof IBuy && (((IBuy) car).canBuy(customer))) {
                canBuy.add(car);
            }
        }
        return canBuy;
    }
}
