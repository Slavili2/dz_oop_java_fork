/**
 * Класс пользователь
 */
public class User {
    private String userLogin;
    private String userPassword;
    private Basket userBasket;

    public User(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userBasket = new Basket();
    }

    /**
     * Получение хэша пароля
     * @return
     */
    public int getUserPassword() {
        return this.userPassword.hashCode();
    }

    /**
     * Получение логина пользователя
     * @return
     */
    public String getUserLogin() {
        return this.userLogin;
    }

    /**
     * Получение всей корзины
     * @return
     */
    public Basket getUserBasket() {
        return userBasket;
    }

    /**
     * Перемещение товара из магазина в корзину пользователя
     * @param productName
     * @param categoryProduct
     */
    public void purchaseOfgoods(String productName, Category categoryProduct){
        Product tempProduct = categoryProduct.getItemFromProductList(productName);
        if (tempProduct.getProductName().equalsIgnoreCase("NONE") == false  && userBasket.addProductIntoBasket(tempProduct) == true){
            if(categoryProduct.removeIteimFromProductList(productName) == true)
                System.out.println("Товар '"+productName+"' из категории '"+categoryProduct.getCategoryName()+ "' перемещён в корзину пользователя "+ this.userLogin);
        }
        else{
            System.out.println("Возникли проблемы с товаром: '"+productName+"'");
        }
    }

}
