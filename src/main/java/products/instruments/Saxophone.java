package products.instruments;

public class Saxophone extends Instrument{

    private int valves;

    public Saxophone(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice, colour);
        this.valves = 24;
        addType(Type.BRASS);
    }

    public int getValves() {
        return valves;
    }

    public String play() {
        return "Saxophone "+ getModel() + " makes some noise, very nice";
    }
}
