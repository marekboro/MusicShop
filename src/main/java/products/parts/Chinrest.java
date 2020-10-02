package products.parts;

import behaviours.ISell;
import products.Product;

public class Chinrest extends Product {
    private String material;
    private ISell relatedProduct;

    public Chinrest(String brand, String model, Double buyPrice, Double sellPrice, String material ) {
        super(brand, model, buyPrice, sellPrice);
        this.material = material;
        this.relatedProduct = null;

    }

    public String getMaterial() {
        return material;
    }

    public void setRelatedProduct(ISell productISell) {
        this.relatedProduct = productISell;
    }

    public ISell getRelatedProduct() {
        return relatedProduct;
    }
}
