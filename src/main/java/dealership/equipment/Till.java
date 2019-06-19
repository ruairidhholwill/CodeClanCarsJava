package dealership.equipment;

public class Till {

    private int money;

    public Till(int money){
        this.money = money;

    }

    public String bing(){
        return "Bing!";
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
