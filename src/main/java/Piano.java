public class Piano extends Instrument {


    public Piano(double buyPrice, double sellPrice, InstrumentType type, String make, String model) {
        super(buyPrice, sellPrice, type, make, model);
    }


    public String play(){
        return "Piano plays notes!";
    }


}
