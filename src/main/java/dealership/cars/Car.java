package dealership.cars;

public abstract class Car {

    private int price;
    private String colour;
    private TyreType tyreType;
    private EngineType engineType;

    public Car(int price, String colour, TyreType tyreType, EngineType engineType){
        this.price = price;
        this. colour = colour;
        this.tyreType = tyreType;
        this.engineType = engineType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public TyreType getTyreType() {
        return tyreType;
    }

    public void setTyreType(TyreType tyreType) {
        this.tyreType = tyreType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
