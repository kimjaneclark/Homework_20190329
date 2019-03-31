import java.util.ArrayList;

public class Shop{

    private ArrayList<Product> stock;

    public Shop(){
        this.stock = new ArrayList();
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public int countStock(){
        return stock.size();
    }


    public void addStock(Product product) {
        stock.add(product);
    }

    public void removeStock(Product product) {
        stock.remove(product);
    }
}
