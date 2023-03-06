import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Product> allProducts = new ArrayList<Product>();
        allProducts.add(new Product("Товар 1", 100, 10, 15));
        allProducts.add(new Product("Товар 2", 99, 8, 10));
        allProducts.add(new Product("BMW", 6000000, 8, 0));

        for (var item: allProducts) {
            System.out.println(item.allProductInformation());
        }


    }
}
