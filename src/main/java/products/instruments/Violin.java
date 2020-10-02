package products.instruments;

public class Violin extends Instrument{

private String bowType;

    public Violin(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice, colour);
        this.bowType = "wood";
        Type stringType = Type.STRING;
        addType(stringType);
    }

    public String play(){
        return  "Violin "+ getModel() + " makes a soft sound";
    }

    public String getBowType() {
        return bowType;
    }
}
