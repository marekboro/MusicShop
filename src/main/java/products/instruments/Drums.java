package products.instruments;

public class Drums extends Instrument{
    private int drumCount;

    public Drums(String brand, String model, Double buyPrice, Double sellPrice, String colour, int drumCount) {
        super(brand, model, buyPrice, sellPrice, colour);
        this.drumCount = drumCount;
        Type percussion = Type.PERCUSSION;
        addType(percussion);
    }

    public int getDrumCount() {
        return drumCount;
    }
}
