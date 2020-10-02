package products.misc;

import products.Product;

public class MusicStand extends Product {
    private int height;

    public MusicStand(String brand, String model, Double buyPrice, Double sellPrice, int height) {
        super(brand, model, buyPrice, sellPrice);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
