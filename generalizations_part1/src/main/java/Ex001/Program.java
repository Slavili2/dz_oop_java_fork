package Ex001;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //тип элементов данного списка - Object
        List myList = new ArrayList();

        for (int i = 0; i <= 5; i++) {
            myList.add(String.format("Строка %d", i));
        }

        System.out.println(myList);
        //System.out.println(allLength(myList));

        myList.add(123);

        System.out.println(myList);

    }
}
