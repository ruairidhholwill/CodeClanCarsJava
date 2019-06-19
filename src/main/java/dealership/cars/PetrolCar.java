package dealership.cars;

import dealership.behaviours.IBuy;
import dealership.behaviours.IDrive;
import dealership.person.Customer;

public class PetrolCar extends Car implements IDrive, IBuy {

    public PetrolCar(int price, String colour, TyreType tyreType, EngineType engineType){
        super(price, colour, tyreType, engineType);
    }

    public String drive(){
        return "BRRRR LOOOORRRRARIIINE KELLLLAAAY";
    }

    public boolean canBuy(Customer customer){
        return customer.getWalletAmount() >= this.getPrice();
    }
}
