package products;

import behaviours.ISell;

public abstract class Product implements ISell {

    private String brand;
    private String model;
    private Double buyPrice;
    private Double sellPrice;

    public Product(String brand, String model, Double buyPrice, Double sellPrice) {
        this.brand = brand;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    //     THIS WILL ALLOW ME TO TREAT THESE AS HASH in a HASHMAP

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
