import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        ArrayList<Product> allProducts = new ArrayList<Product>();
        allProducts.add(new Product("Laptop MSI", 100000, 10, 1));
        allProducts.add(new Product("Laptop Acer", 50000, 8, 2));
        allProducts.add(new Product("PC DNS", 30000, 7, 0.5));




        Category category1 = new Category("Автосалон");
        category1.addIteimIntoProductList(new Product("BMW", 6000000, 8, 0));
        category1.addIteimIntoProductList(new Product("AUDI", 5000000, 8, 0));
        category1.addIteimIntoProductList(new Product("Москвич 412", 20000, 50, 3));


        Category category2 = new Category("Компьютерный салон", allProducts);

        System.out.println("+++++++++++++++++++ Товары до всяких покупок в "+category1.getCategoryName()+" ++++++++++++++++++++++");
        for (var item: category1.getProductList()) {
            System.out.println(((Product)item).allProductInformation());
        }
        System.out.println("+++++++++++++++++++ Товары до всяких покупок в "+category2.getCategoryName()+" ++++++++++++++++++++++");
        for (var item: category2.getProductList()) {
            System.out.println(((Product)item).allProductInformation());
        }



        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        User user1 = new User("Александр","password!@");
        System.out.println("User: "+user1.getUserLogin());
        System.out.println("Password: "+user1.getUserPassword());
        System.out.println("\t\t\t\t\t\tПокупка");
        user1.purchaseOfgoods("BMW", category1);
        user1.purchaseOfgoods("Laptop Acer", category2);
        System.out.println("\n*************************************************");
        System.out.println("В корзине пользователя " + user1.getUserLogin() + " находятся товары:\n");

        for (var item: user1.getUserBasket().getProductsFromBasket()
             ) {
            System.out.println(item.allProductInformation());
        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        User user2 = new User("Фёдор","pa$$word!@");
        System.out.println("User: "+user2.getUserLogin());
        System.out.println("Password: "+user2.getUserPassword());
        System.out.println("\t\t\t\t\t\tПокупка");
        user2.purchaseOfgoods("Москвич 412", category1);
        user2.purchaseOfgoods("PC DNS", category2);
        System.out.println("\n*************************************************");
        System.out.println("В корзине пользователя " + user2.getUserLogin() + " находятся товары:\n");

        for (var item: user2.getUserBasket().getProductsFromBasket()
        ) {
            System.out.println(item.allProductInformation());
        }


        System.out.println("+++++++++++++++++++ Оставшиеся товары в  "+category1.getCategoryName()+" ++++++++++++++++++++++");
        for (var item: category1.getProductList()) {
            System.out.println(((Product)item).allProductInformation());
        }
        System.out.println("+++++++++++++++++++ Оставшиеся товары в  "+category2.getCategoryName()+" ++++++++++++++++++++++");
        for (var item: category2.getProductList()) {
            System.out.println(((Product)item).allProductInformation());
        }
    }
}
