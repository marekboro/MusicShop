package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.Saxophone;
import products.instruments.Trumpet;
import products.instruments.Type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Blowy","RedCheeks",230.0,500.0, "brass","black");
    }

    @Test
    public void hasMouthpiece(){
        assertEquals("black",trumpet.getMouthPieceColour());
    }
    @Test
    public void hasType(){
        assertEquals(1,trumpet.getTypes().size());
        assertSame(trumpet.getTypes().get(0), Type.BRASS);

    }
    @Test
    public void canPlay(){
        assertEquals("Trumpet RedCheeks makes a buzzing sound",trumpet.play());
    }

}
