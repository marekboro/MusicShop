package miscTests;
import org.junit.Before;
import org.junit.Test;
import products.misc.Headphones;
import static org.junit.Assert.assertTrue;

public class HeadPhoneTest {

    Headphones headphones;

    @Before
    public void before() {
        headphones = new Headphones("Yamaha", "Whisper", 5.0, 15.0, true);
    }

    @Test
    public void hasNoiseCancelling() {
        assertTrue(headphones.isNoiseCancelling());
    }

}

