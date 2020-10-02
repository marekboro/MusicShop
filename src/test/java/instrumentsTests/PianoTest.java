package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.Piano;
import products.instruments.Type;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha","KeyBender",230.0,500.0, "black");
    }


    @Test
    public void has88Keys(){
        assertEquals(88,piano.getKeyCount());
    }
    @Test
    public void has2Types(){
        assertEquals(2,piano.getTypes().size());
        assertSame(piano.getTypes().get(0), Type.STRING);
        assertSame(piano.getTypes().get(1), Type.PERCUSSION);
    }
    @Test
    public void canPlay(){
        assertEquals("Yamaha Piano KeyBender makes a nice sound",piano.play());
    }

}
