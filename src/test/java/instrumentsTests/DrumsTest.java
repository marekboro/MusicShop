package instrumentsTests;

import org.junit.Before;
import org.junit.Test;
import products.instruments.Drums;
import products.instruments.Type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DrumsTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums("Basher","NeighbourSmasher",200.0,300.0,"grey",5);
    }

    @Test
    public void hasDrumCount5(){

            assertEquals(5,drums.getDrumCount());
        }

        @Test
        public void hasType(){
            {
                assertSame(drums.getTypes().get(0), Type.PERCUSSION);
            }


    }


}
