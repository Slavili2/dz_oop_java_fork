import java.util.ArrayList;

/**
 *  Класс Категория товаров
 */
public class Category {


    private String categoryName;

    private ArrayList<Product> productList;

    public Category(String categoryName, ArrayList<Product> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    public Category(String categoryName, Product userProduct) {
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
        this.productList.add(userProduct);
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
    }

    /**
     * Получение полного списка товаров данной категории
     * @return
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * Добавление отдельного товара
     * @param userProduct
     * @return - true - успешно добавлен, false - товар не добавлен
     */
    public boolean addIteimIntoProductList(Product userProduct) {
        return this.productList.add(userProduct);
    }

    public Product getItemFromProductList(String productName) {
        int tempInt = -1;
        for (var item: this.productList) {
            if(item.getProductName() == productName)
                tempInt = this.productList.indexOf(item);
                break;
        }
         return this.productList.get(tempInt);
    }

    /**
     * Удаление товара из списка по его имени
     * @param nameOfProduct - имя товара
     * @return - true - товар успешно удалён, false - не удалён
     */
    public boolean removeIteimFromProductList(String nameOfProduct) {
        return this.productList.removeIf(product -> (product.getProductName()==nameOfProduct));
    }

    /**
     * Получение имени категории
     * @return
     */
    public String getCategoryName() {
        return categoryName;
    }
}
