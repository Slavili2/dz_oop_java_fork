import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        ArrayList<Product> allProducts = new ArrayList<Product>();
        allProducts.add(new Product("Товар 1", 100, 10, 15));
        allProducts.add(new Product("Товар 2", 99, 8, 10));
        //allProducts.add(new Product("BMW", 6000000, 8, 0));
        //allProducts.removeIf(product -> (product.getProductName()=="BMW"));



        //Category category1 = new Category("Разный товар", allProducts);
        //Category category1 = new Category("Cars", new Product("AUDI", 5000000, 8, 0));
        Category category1 = new Category("Cars");
        category1.addIteimIntoProductList(new Product("BMW", 6000000, 8, 0));
        category1.addIteimIntoProductList(new Product("AUDI", 5000000, 8, 0));

        System.out.println(category1.getCategoryName());

        for (var item: category1.getProductList()) {
            System.out.println(((Product)item).allProductInformation());
        }
        System.out.println(category1.removeIteimFromProductList("AUDI"));

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-__");

        for (var item: category1.getProductList()) {
            System.out.println(((Product)item).allProductInformation());
        }

        //System.out.println(category1.getItemFromProductList("BMW"));
        System.out.println("*************************************************");
        category1.getItemFromProductList("BMW");
        Basket bask1 = new Basket();
        Basket bask2 = new Basket();
        bask1.addProductIntoBasket(category1.getItemFromProductList("BMW"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (var item: bask1.getProductsFromBasket()) {
            System.out.println(item.allProductInformation());
        }

    }
}
