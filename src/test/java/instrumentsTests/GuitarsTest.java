package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.ElectricGuitar;
import products.instruments.Guitar;
import products.instruments.Type;

import static org.junit.Assert.*;

public class GuitarsTest {

    Guitar guitar;
    ElectricGuitar electricGuitar;


    @Before
    public void before() {
        guitar = new Guitar("Stinger","ZX204",250.0,400.0,  "black");
        electricGuitar = new ElectricGuitar("Zapper","Amp300",350.0,600.0,  "silver");
    }

    @Test
    public void hasTYPE(){
        assertSame(guitar.getTypes().get(0), Type.STRING);
        assertSame(electricGuitar.getTypes().get(0), Type.STRING);
        assertSame(electricGuitar.getTypes().get(1),Type.ELECTRIC);
        assertEquals(2,electricGuitar.getTypes().size());

    }
    @Test
    public void has5Strings(){
        assertEquals(5,guitar.getNumberOfStrings());
        assertEquals(5,electricGuitar.getNumberOfStrings());

    }
    @Test
    public void hasColour(){
        assertEquals("black",guitar.getColour());
        assertEquals("silver",electricGuitar.getColour());

    }
    @Test
    public void canPlay(){
        assertEquals("Guitar ZX204 makes some noise ",guitar.play());
        assertEquals("Electric Guitar Amp300 makes some heavy noise ",electricGuitar.play());

    }


}
