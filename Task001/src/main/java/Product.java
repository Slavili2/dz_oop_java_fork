/**
 * Класс Товар
 */
public class Product {

    private String productName;
    private double price;
    private int rating;

    private double discount;

    public Product(String name, double price, int rating, double discount) {
        this.productName = name;
        this.discount = discount;
        this.price = price;
        this.rating = rating;
    }

    /**
     * Получение цены
     * @return
     */
    public double getPrice() {
        return this.price - this.price * this.discount / 100;
    }

    /**
     * Получение имени товара
     * @return
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * Получение рейтинга
     * @return
     */
    public int getRating() {
        return this.rating;
    }

    /**
     * Получение скидки
     * @return
     */
    public double getDiscount() {
        return this.discount;
    }

    /**
     * Получение всей информации о товаре
     * @return
     */
    public StringBuilder allProductInformation() {

        StringBuilder result = new StringBuilder();
        result.append("Наименование товара: " + this.productName + "\n");
        result.append("Цена товара без скидки: " + this.price + " ₽\n");
        result.append("Цена товара со скидкой: " + this.getPrice() + " ₽\n");
        result.append("Скидка: " + this.discount + " %\n");

        return result;

    }

}
