package miscTests;

import org.junit.Before;
import org.junit.Test;
import products.misc.Pick;

import static org.junit.Assert.assertEquals;

public class PickTest {

    Pick pick;
    @Before
    public void before(){
        pick = new Pick("Yahama", "Thin", 0.5,2.0,"red","plastic");
    }

    @Test
    public void hasColour(){
        assertEquals("red",pick.getColour());
    }
    @Test
    public void hasMaterial(){
        assertEquals("plastic",pick.getMaterial());
    }
}
