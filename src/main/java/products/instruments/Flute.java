package products.instruments;

public class Flute extends Instrument {
    private String woodType;

    public Flute(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice, colour);
        Type string = Type.WOODWIND;
        addType(string);
        this.woodType = "oak";
    }

    public String play() {
        return "Flute "+ getModel() + " makes a nice" + woodType +"y sound ";
    }


    public String getWoodType() {
        return woodType;
    }
}

