import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Trombone trombone;
    SheetMusic sheetMusic;


    @Before
    public void setup() {
        shop = new Shop();
        trombone = new Trombone(95.0, 165.00, InstrumentType.BRASS,"Yamaha", "15Gh", true);
        sheetMusic = new SheetMusic(5.0, 10.0, "Beethoven Symphony No 5");

    }


    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addStock(trombone);
        assertEquals(1, shop.countStock());

    }

    @Test
    public void canRemoveItemsFromStock() {
        shop.addStock(trombone);
        shop.addStock(sheetMusic);
        shop.removeStock(trombone);
        assertEquals(1, shop.countStock());
   }


}
