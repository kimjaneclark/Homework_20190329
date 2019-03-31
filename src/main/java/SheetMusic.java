public class SheetMusic extends Accessories{


    public SheetMusic(double buyPrice, double sellPrice, String description){
        super(buyPrice, sellPrice, description);

    }


    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
