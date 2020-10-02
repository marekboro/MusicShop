package products.misc;

import products.Product;

public class Headphones extends Product {
    private boolean noiseCancelling;
    public Headphones(String brand, String model, Double buyPrice, Double sellPrice, boolean noiseCancelling) {
        super(brand, model, buyPrice, sellPrice);
        this.noiseCancelling =  noiseCancelling;
    }

    public boolean isNoiseCancelling() {
        return noiseCancelling;
    }


}
