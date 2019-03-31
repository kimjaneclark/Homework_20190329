import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setup(){
        sheetMusic = new SheetMusic(5.0, 10.0, "Beethoven Symphony No 5");
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(5.0, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canSetBuyPrice(){
        sheetMusic.setBuyPrice(6.0);
        assertEquals(6.0, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(10.0, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        sheetMusic.setSellPrice(12.0);
        assertEquals(12.0, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Beethoven Symphony No 5", sheetMusic.getDescription());
    }

    @Test
    public void canUpdateDescription(){
        sheetMusic.setDescription("Beethoven Symphony No 9");
        assertEquals("Beethoven Symphony No 9", sheetMusic.getDescription());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(5.0, sheetMusic.calculateMarkup(), 0.01);
    }




}
