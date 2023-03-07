import java.util.ArrayList;

public class Basket {


    private ArrayList<Product> customPurchases;


    public Basket() {
        this.customPurchases = new ArrayList<>();
    }

    public void addProductIntoBasket(Product prod1){
        this.customPurchases.add(prod1);
    }

    public ArrayList<Product> getProductsFromBasket(){
        return this.customPurchases;
    }
}
