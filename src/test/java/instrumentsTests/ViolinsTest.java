package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.*;

import static org.junit.Assert.*;

public class ViolinsTest {

    Violin violin;
    ElectricViolin electricViolin;


    @Before
    public void before() {
        violin = new Violin("Stinger","ZX204",250.0,400.0,  "black");
        electricViolin = new ElectricViolin("Zapper","Amp300",350.0,600.0,  "silver");
    }

    @Test
    public void hasTYPE(){
        assertSame(violin.getTypes().get(0), Type.STRING);
        assertSame(electricViolin.getTypes().get(0), Type.STRING);
        assertSame(electricViolin.getTypes().get(1),Type.ELECTRIC);
        assertEquals(2,electricViolin.getTypes().size());

    }
    @Test
    public void hasBowType(){
        assertEquals("wood",violin.getBowType());
        assertEquals("metal",electricViolin.getBowType());

    }
    @Test
    public void hasColour(){
        assertEquals("black",violin.getColour());
        assertEquals("silver",electricViolin.getColour());

    }
    @Test
    public void canPlay(){
        assertEquals("Violin ZX204 makes a soft sound",violin.play());
        assertEquals("Electric Violin Amp300 makes an electric sound",electricViolin.play());

    }


}
