package miscTests;

import org.junit.Before;
import org.junit.Test;
import products.misc.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    DrumSticks drumSticks;
    @Before
    public void before(){
        drumSticks = new DrumSticks("OffBrand","Smashers",5.0,15.0,"wood");
    }
    @Test
    public void hasBrand(){
        assertEquals("OffBrand",drumSticks.getBrand());
    }
    @Test
    public void hasModel(){
        assertEquals("Smashers",drumSticks.getModel());
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(5.0,drumSticks.getBuyPrice(),0.01);
    }
    @Test
    public void hasSellPriceAndCanChangeIt(){
        assertEquals(15.0,drumSticks.getSellPrice(),0.01);
        drumSticks.setSellPrice(25.0);
        assertEquals(25.0,drumSticks.getSellPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("wood",drumSticks.getMaterial());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(10.0,drumSticks.calculateMarkup(),0.01);
        drumSticks.setSellPrice(25.0);
        assertEquals(20.0,drumSticks.calculateMarkup(),0.01);
        drumSticks.setSellPrice(3.0);
        assertEquals(-2.0,drumSticks.calculateMarkup(),0.01);

    }

}
