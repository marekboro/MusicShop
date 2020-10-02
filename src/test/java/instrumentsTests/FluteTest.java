package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.Flute;
import products.instruments.Type;

import static org.junit.Assert.assertSame;

public class FluteTest {
    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Chimes","Oakth",30.0,60.0,"cream");
    }

    @Test
    public void hasType(){
            assertSame(flute.getTypes().get(0), Type.WOODWIND);
        }

    @Test
    public void hasWoodType() {
        assertSame("oak", flute.getWoodType());
    }
}



