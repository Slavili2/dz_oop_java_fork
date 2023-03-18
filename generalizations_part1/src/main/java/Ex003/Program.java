package Ex003;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //Methods m1 = new Methods();
        List<String> l1 = new ArrayList<>();
        l1.add("Привет");
        l1.add("Мир");

        System.out.println(l1);

        System.out.println(Methods.getElementFromUCollection(l1, 0));
        System.out.println(Methods.getElementFromUCollection(l1, 1));

        System.out.println(Methods.<Integer, String>put(1,"Привет"));
        System.out.println(Methods.put(1,2));



    }
}
