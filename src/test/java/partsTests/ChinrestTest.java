package partsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.Violin;
import products.parts.Chinrest;

import static org.junit.Assert.assertEquals;

public class ChinrestTest {

    Violin violin;
    Chinrest chinrest;

    @Before
    public void before() {
        violin = new Violin("Stinger","ZX204",250.0,400.0,  "black");
        chinrest = new Chinrest("Stinger","ZX204", 30.0,50.0, "oak");
        chinrest.setRelatedProduct(violin);
    }

    @Test
    public void hasMaterial(){
        assertEquals("oak",chinrest.getMaterial());
    }
    @Test
    public void hasRelatedProduct(){
        assertEquals(violin,chinrest.getRelatedProduct());
    }

}
