package miscTests;

import org.junit.Before;
import org.junit.Test;
import products.misc.MusicStand;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {

    MusicStand musicStand;
    @Before
    public void before(){
        musicStand = new MusicStand("A brand","A model", 15.0,25.0,140);
    }
    @Test
    public void hasHeight() {
        assertEquals(140,musicStand.getHeight());
    }

}
