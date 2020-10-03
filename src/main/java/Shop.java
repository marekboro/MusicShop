
import behaviours.ISell;
import products.Product;
import products.instruments.Instrument;

import java.util.*;


public class Shop {

    private String name;
    private HashMap<ISell, Integer> stock;
    private double till;

    public Shop(String name, double till) {
        this.name = name;
        this.stock = new HashMap<ISell, Integer>();
        this.till = till;
    }

    public String getName() {
        return name;
    }


    public HashMap<ISell, Integer> getStock() {
        return stock;
    }


    public void addItemISellToStock(ISell item) {
        int value = 1;
        if (stock.containsKey(item)) {
            value = stock.get(item);
            stock.put(item, value + 1);
        } else stock.put(item, value);
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public boolean canAfford(Product product) {
        return till > product.getBuyPrice();
    }

    public void buy(Product product) {
        if (canAfford(product)) {
            addItemISellToStock(product);
            setTill(getTill() - product.getBuyPrice());
        }
    }

    public void sell(Product product) {
        if (isInStock(product)) {
            removeItemISellFromStock(product);
            till += product.getSellPrice();
        }
    }

    public boolean isInStock(Product product) {
        int count = 0;
        if (stock.containsKey(product)) {
            if (stock.get(product) > 0) {
                count += 1;
            }
        }
        return count > 0;
    }

    public void removeItemISellFromStock(ISell item) {
        int count = stock.get(item);
        stock.replace(item, count - 1);
    }

    public String demonstrateInstrument(Instrument instrument) {
        return instrument.play();
    }


    public Double calculateWorth() {
        double total = getTill();
        Set<ISell> keys = getStock().keySet();
        for (ISell key : keys) {

            total += ((Product) key).getBuyPrice() * getStock().get(key);

        }
        return total;
    }

    public Double calculateWorthAfterProfit() {
        double total = getTill();
        Set<ISell> keys = getStock().keySet();
        for (ISell key : keys) {

            total += ((Product) key).getSellPrice() * getStock().get(key);

        }
        return total;
    }

    public Double calculateProfitOnStock() {
        double total = 0.0;
        Set<ISell> keys = getStock().keySet();
        for (ISell key : keys) {

            total += key.calculateMarkup() * getStock().get(key);

        }
        return total;
    }

    public int getTotalItemsInStock() {
        int total = 0;

        Set<ISell> keys = getStock().keySet();
        for (ISell key : keys) {

            total += getStock().get(key);

        }
        return total;
    }

}
