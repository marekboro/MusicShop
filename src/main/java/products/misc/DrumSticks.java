package products.misc;

import products.Product;

public class DrumSticks extends Product {
    private String material;
    public DrumSticks(String brand, String model, Double buyPrice, Double sellPrice, String material) {
        super(brand, model, buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
