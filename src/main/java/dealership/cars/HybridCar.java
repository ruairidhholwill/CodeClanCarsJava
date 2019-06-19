package dealership.cars;

import dealership.behaviours.IDrive;

public class HybridCar extends Car implements IDrive {

    public HybridCar(int price, String colour, TyreType tyreType, EngineType engineType){
        super(price, colour, tyreType, engineType);
    }

    public String drive(){
        return ".... bmm bmm LORRAINE ... lor kelllAAAYYYY";
    }
}
