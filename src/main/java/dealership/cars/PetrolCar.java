package dealership.cars;

import dealership.behaviours.IDrive;

public class PetrolCar extends Car implements IDrive {

    public PetrolCar(int price, String colour, TyreType tyreType, EngineType engineType){
        super(price, colour, tyreType, engineType);
    }

    public String drive(){
        return "BRRRR LOOOORRRRARIIINE KELLLLAAAY";
    }
}
