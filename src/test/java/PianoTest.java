import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setup(){
        piano = new Piano(100.0, 200.00, InstrumentType.KEYBOARD,"Yamaha", "C123");
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(100.0, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canSetBuyPrice(){
        piano.setBuyPrice(150);
        assertEquals(150.0, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(200.0, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        piano.setSellPrice(250.);
        assertEquals(250.0, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canSetInstrumentType(){
        piano.setType(InstrumentType.BRASS);
        assertEquals(InstrumentType.BRASS, piano.getType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void canSetMake(){
        piano.setMake("Steinway");
        assertEquals("Steinway", piano.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("C123", piano.getModel());
    }

    @Test
    public void canSetModel(){
        piano.setModel("AB89");
        assertEquals("AB89", piano.getModel());
    }

    @Test
    public void tromboneCanPlay(){
        assertEquals("Piano plays notes!", piano.play());
    }








}
