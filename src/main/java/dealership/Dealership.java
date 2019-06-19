package dealership;

import dealership.behaviours.IDrive;
import dealership.cars.ElectricCar;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<IDrive> carStock;
    private String name;

    public Dealership(String name){
        this.carStock = new ArrayList<IDrive>();
        this.name = name;
    }
}
