package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.Piano;
import products.instruments.Saxophone;
import products.instruments.Type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Windy","AirBender",230.0,500.0, "brass");
    }


    @Test
    public void has24Valves(){
        assertEquals(24,saxophone.getValves());
    }
    @Test
    public void hasType(){
        assertEquals(1,saxophone.getTypes().size());
        assertSame(saxophone.getTypes().get(0), Type.BRASS);

    }
    @Test
    public void canPlay(){
        assertEquals("Saxophone AirBender makes some noise, very nice",saxophone.play());
    }

}
