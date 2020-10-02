package products.instruments;

public class ElectricGuitar extends Instrument {
    private int numberOfStrings;

    public ElectricGuitar(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice, colour);
        Type stringType = Type.STRING;
        Type electric = Type.ELECTRIC;
        addType(stringType);
        addType(electric);
        this.numberOfStrings = 5;
    }

    public String play() {
        return "Electric Guitar "+ getModel() + " makes some heavy noise ";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
