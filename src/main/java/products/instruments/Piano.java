package products.instruments;

public class Piano extends Instrument {

    private final int keyCount;

    public Piano(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice, colour);
        this.keyCount = 88;
        Type stringType = Type.STRING;
        Type percussion = Type.PERCUSSION;
        addType(stringType);
        addType(percussion);
    }

    public int getKeyCount() {
        return keyCount;
    }

    public String play(){
        return getBrand() +" Piano "+ getModel() + " makes a nice sound";
    }

}
