package miscTests;

import org.junit.Before;
import org.junit.Test;
import products.misc.MusicPaper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MusicPaperTest {

    MusicPaper musicPaper;

    @Before
    public void before(){
        musicPaper = new MusicPaper("Recyclers","A4x50",5.0,10.0,50);

    }
    @Test
    public void hasSheets() {
        assertEquals(50,musicPaper.getSheetsCount());
    }

}
