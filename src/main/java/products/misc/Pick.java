package products.misc;

import products.Product;

public class Pick extends Product {
    private String colour;
    private String material;

    public Pick(String brand, String model, Double buyPrice, Double sellPrice, String colour, String material) {
        super(brand, model, buyPrice, sellPrice);
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
