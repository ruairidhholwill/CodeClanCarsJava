package dealership.cars;

import dealership.behaviours.IBuy;
import dealership.behaviours.IDrive;
import dealership.person.Customer;

public class ElectricCar extends Car implements IDrive, IBuy {

    public ElectricCar(int price, String colour, TyreType tyreType, EngineType engineType){
        super(price, colour, tyreType, engineType);
    }

    public String drive(){
        return ".... bmm bmm lor ... lor aiiiine";
    }

    public boolean canBuy(Customer customer){
        return customer.getWalletAmount() >= this.getPrice();
    }
}
