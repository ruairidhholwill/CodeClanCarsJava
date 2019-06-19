package dealership.cars;

import dealership.behaviours.IDrive;

public class ElectricCar extends Car implements IDrive {

    public ElectricCar(int price, String colour, TyreType tyreType, EngineType engineType){
        super(price, colour, tyreType, engineType);
    }

    public String drive(){
        return ".... bmm bmm lor ... lor aiiiine";
    }
}
