package products.instruments;

public class ElectricViolin extends Instrument{

    private String bowType;

    public ElectricViolin(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice, colour);
        this.bowType = "metal";
        Type stringType = Type.STRING;
        Type electricType = Type.ELECTRIC;
        addType(stringType);
        addType(electricType);

    }

    public String play(){
        return  "Electric Violin "+ getModel() + " makes an electric sound";
    }

    public String getBowType() {
        return bowType;
    }
}
