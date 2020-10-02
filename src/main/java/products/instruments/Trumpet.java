package products.instruments;

public class Trumpet extends Instrument{

    private String mouthPieceColour;

    public Trumpet(String brand, String model, Double buyPrice, Double sellPrice, String colour, String mouthPieceColour) {
        super(brand, model, buyPrice, sellPrice, colour);
        this.mouthPieceColour = mouthPieceColour;
        addType(Type.BRASS);
    }

    public String getMouthPieceColour() {
        return mouthPieceColour;
    }

    public String play() {
        return "Trumpet "+ getModel() + " makes a buzzing sound";
    }
}
