public abstract class Accessories extends Product implements iSell{


    private String description;


    public Accessories (double buyPrice, double sellPrice, String description){
        super(buyPrice, sellPrice);
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
