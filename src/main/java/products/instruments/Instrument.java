package products.instruments;

import behaviours.IPlay;
import products.Product;

import java.util.ArrayList;

public abstract class Instrument extends Product implements IPlay {

    private ArrayList<Type> types;
    private String colour;

    public Instrument(String brand, String model, Double buyPrice, Double sellPrice, String colour) {
        super(brand, model, buyPrice, sellPrice);
        this.types = new ArrayList<Type>();
        this.colour = colour;
    }

    public String play(){
        return "";
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public String getColour() {
        return colour;
    }
    public void addType(Type type){
        this.types.add(type);
    }
}
