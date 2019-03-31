public class Trombone extends Instrument implements iSell{

    private boolean brass;

    public Trombone(double buyPrice, double sellPrice, InstrumentType type, String make, String model, boolean brass) {
        super(buyPrice, sellPrice, type, make, model);
        this.brass = brass;
    }

    public boolean isBrass() {
        return brass;
    }

    public void setBrass(boolean brass) {
        this.brass = brass;
    }

    public String play(){
        return "Trombone goes brrrummmmmm";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }


}
