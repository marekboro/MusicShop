import org.junit.Before;
import org.junit.Test;
import products.instruments.Guitar;
import products.instruments.Violin;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Violin violin;

    @Before
    public void before() {

        shop = new Shop("Play us out", 1300.0);
        guitar = new Guitar("Brand1", "model2", 400.0, 800.0, "whitewood");
        violin = new Violin("Stinger", "ZX204", 250.0, 400.0, "black");

    }

    @Test
    public void hasName() {
        assertEquals("Play us out", shop.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(1300.0, shop.getTill(), 0.01);
    }

    @Test
    public void canBuyItemsAndAddItToStockWhileTillHasMoney() {
        assertEquals(0, shop.getStock().size());
        shop.buy(guitar);
        assertEquals(900.0, shop.getTill(), 0.01);
        assertEquals(1, shop.getStock().size());
        shop.buy(guitar);
        assertEquals(500.0, shop.getTill(), 0.01);
        assertEquals(2, (int) shop.getStock().get(guitar));
        shop.buy(guitar);
        assertEquals(100.0, shop.getTill(), 0.01);
        assertEquals(3, (int) shop.getStock().get(guitar));
        shop.buy(guitar);
        assertEquals(100.0, shop.getTill(), 0.01);
        assertEquals(3, (int) shop.getStock().get(guitar));
        assertEquals(1, shop.getStock().size());

    }

    @Test
    public void canDemoInstrument() {
        assertEquals("Guitar model2 makes some noise ", shop.demonstrateInstrument(guitar));
    }

    @Test
    public void canGetTotalValueOfTillAndItems() {
        shop.buy(guitar);
        shop.buy(violin);
        shop.buy(violin);
        shop.buy(violin);

        assertEquals(1300.0, shop.calculateWorth(), 0.01);


    }

    @Test
    public void canGetTilConsideringIfItemsGotSold() {
        shop.buy(guitar);
        shop.buy(violin);
        shop.buy(violin);
        shop.buy(violin);

        assertEquals(2150.0, shop.calculateWorthAfterProfit(), 0.01);


    }

    @Test
    public void stockHasUniqueItemsCount() {
        shop.buy(guitar);
        shop.buy(violin);
        assertEquals(2, shop.getStock().size());
        shop.buy(violin);
        shop.buy(violin);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void stockHasAllItemsCount() {
        shop.buy(guitar);
        shop.buy(violin);
        assertEquals(2, shop.getTotalItemsInStock());
        shop.buy(violin);
        shop.buy(violin);
        assertEquals(4, shop.getTotalItemsInStock());
    }

    @Test
    public void canCheckIfItemIsInStock() {
        assertFalse(shop.isInStock(guitar));
        shop.buy(guitar);
        assertTrue(shop.isInStock(guitar));
        assertFalse(shop.isInStock(violin));
        shop.buy(violin);
        assertTrue(shop.isInStock(guitar));
        assertTrue(shop.isInStock(violin));
    }

    @Test
    public void canRemoveOneFromStock() {
        assertFalse(shop.isInStock(guitar));
        shop.buy(guitar);
        assertTrue(shop.isInStock(guitar));
        shop.removeItemISellFromStock(guitar);
        assertFalse(shop.isInStock(guitar));

        assertFalse(shop.isInStock(violin));
        shop.buy(violin);
        shop.buy(violin);
        shop.removeItemISellFromStock(violin);
        assertTrue(shop.isInStock(violin));
        shop.removeItemISellFromStock(violin);
        assertFalse(shop.isInStock(violin));
    }


    @Test
    public void canSellItem() {
        assertFalse(shop.isInStock(guitar));
        shop.buy(guitar);
        assertEquals(900.0, shop.getTill(), 0.01);
        assertTrue(shop.isInStock(guitar));

        shop.sell(guitar);
        assertFalse(shop.isInStock(guitar));
        assertEquals(1700.0, shop.getTill(), 0.01);

    }

    @Test
    public void canShowPotentialProfitFromStock() {
        assertFalse(shop.isInStock(guitar));
        shop.buy(guitar);
        assertEquals(900.0, shop.getTill(), 0.01);
        assertTrue(shop.isInStock(guitar));
        assertEquals(400.0, shop.calculateProfitOnStock(), 0.01);
        shop.buy(violin);
        shop.buy(violin);
        shop.buy(violin);
        assertEquals(850.0, shop.calculateProfitOnStock(), 0.01);

    }


}
