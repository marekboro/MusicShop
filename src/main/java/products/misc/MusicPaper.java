package products.misc;

import products.Product;

public class MusicPaper extends Product {
    private int sheetsCount;

    public MusicPaper(String brand, String model, Double buyPrice, Double sellPrice, int sheetsCount) {
        super(brand, model, buyPrice, sellPrice);
        this.sheetsCount = sheetsCount;
    }

    public int getSheetsCount() {
        return sheetsCount;
    }
}
