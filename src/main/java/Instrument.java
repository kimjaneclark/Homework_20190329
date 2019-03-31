public abstract class Instrument extends Product implements iPlay {

    private InstrumentType type;
    private String make;
    private String model;



    public Instrument (double buyPrice, double sellPrice, InstrumentType type, String make, String model){
        super(buyPrice, sellPrice);
        this.type = type;
        this.make = make;
        this.model = model;

    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
