package dealership.person;

public class Customer extends Person{

    private int wallet;

    public Customer(String name, int wallet){
        super(name);
        this.wallet = wallet;
    }

    public int getWalletAmount(){
        return this.wallet;
    }
}
