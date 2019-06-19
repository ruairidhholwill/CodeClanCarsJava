package dealership.cars;

import dealership.behaviours.IBuy;
import dealership.behaviours.IDrive;
import dealership.person.Customer;

public class HybridCar extends Car implements IDrive, IBuy {

    public HybridCar(int price, String colour, TyreType tyreType, EngineType engineType){
        super(price, colour, tyreType, engineType);
    }

    public String drive(){
        return ".... bmm bmm LORRAINE ... lor kelllAAAYYYY";
    }

    public boolean canBuy(Customer customer){
        return customer.getWalletAmount() >= this.getPrice();
    }
}
