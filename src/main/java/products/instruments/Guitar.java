package products.instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice, colour);
        Type string = Type.STRING;
        addType(string);
        this.numberOfStrings = 5;
    }

    public String play() {
        return "Guitar "+ getModel() + " makes some noise ";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
