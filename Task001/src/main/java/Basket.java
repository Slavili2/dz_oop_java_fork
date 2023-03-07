import java.util.ArrayList;

/**
 * Класс корзина
 */
public class Basket {
    private ArrayList<Product> customPurchases;
    public Basket() {
        this.customPurchases = new ArrayList<>();
    }

    /**
     * Добавление товара в корзину
     * @param prod1 - объект класса Product
     */
    public boolean addProductIntoBasket(Product prod1){
        return this.customPurchases.add(prod1);
    }

    /**
     * Получение списка товаров в корзине
     * @return - список товаров, элементов которого является экземпляр класса Product
     */
    public ArrayList<Product> getProductsFromBasket(){
        return this.customPurchases;
    }
}
