package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.Guitar;
import products.instruments.Type;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void before() {
        guitar = new Guitar("Stinger","ZX204",250.0,400.0,  "black");
    }

    @Test
    public void hasTYPE(){
        assertTrue(guitar.getTypes().get(0) == Type.STRING);
    }
    @Test
    public void has5Strings(){
        assertEquals(5,guitar.getNumberOfStrings());

    }
    @Test
    public void hasColour(){
        assertEquals("black",guitar.getColour());

    }
    @Test
    public void canPlay(){
        assertEquals("Guitar ZX204 makes some noise ",guitar.play());

    }


}
