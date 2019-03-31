import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {


    Trombone trombone;

    @Before
    public void setup(){
        trombone = new Trombone(95.0, 165.00, InstrumentType.BRASS,"Yamaha", "15Gh", true);
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(95.0, trombone.getBuyPrice(), 0.01);
    }

    @Test
    public void canSetBuyPrice(){
        trombone.setBuyPrice(85);
        assertEquals(85.0, trombone.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(165.0, trombone.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        trombone.setSellPrice(155.0);
        assertEquals(155.0, trombone.getSellPrice(), 0.01);
    }

    @Test
    public void canSetInstrumentType(){
        trombone.setType(InstrumentType.WOODWIND);
        assertEquals(InstrumentType.WOODWIND, trombone.getType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, trombone.getType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Yamaha", trombone.getMake());
    }

    @Test
    public void canSetMake(){
        trombone.setMake("Bach");
        assertEquals("Bach", trombone.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("15Gh", trombone.getModel());
    }

    @Test
    public void canSetModel(){
        trombone.setModel("15GH");
        assertEquals("15GH", trombone.getModel());
    }

    @Test
    public void isInstrumentBrass(){
        assertEquals(true, trombone.isBrass());
    }

    @Test
    public void setInstrumentToNonBrass(){
        trombone.setBrass(false);
        assertEquals(false, trombone.isBrass());
    }

    @Test
    public void tromboneCanPlay(){

        assertEquals("Trombone goes brrrummmmmm", trombone.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(70.0, trombone.calculateMarkup(), 0.01);

    }


}
