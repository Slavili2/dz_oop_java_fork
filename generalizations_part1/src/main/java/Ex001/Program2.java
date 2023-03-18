package Ex001;

import java.util.ArrayList;
import java.util.List;
public class Program2 {
    //тип элементов данного списка - Строка
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        for (int i = 0; i <= 5; i++) {
            myList.add(String.format("Строка %d", i+3));
        }

        System.out.println(myList);
        //System.out.println(allLength(myList));
    }
}
