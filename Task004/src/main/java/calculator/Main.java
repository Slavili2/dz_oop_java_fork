package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calc<Integer> integerCalc = new Calc<>();
        integerCalc.sum(new ArrayList<>(Arrays.asList(1,2)));
        System.out.println(integerCalc.sum(new ArrayList<>(Arrays.asList(1,2))));

        System.out.println(integerCalc.multiplication(4,6));

        List<Integer> mult = new ArrayList<>();
        for (int i = 2; i <=5 ; i++) {
            mult.add(i);
        }

        System.out.println(integerCalc.multiplicationArray(mult));

        System.out.println(integerCalc.division(4,5));

        System.out.println(integerCalc.decToBin(100));
        System.out.println(integerCalc.decToBin("100"));

        System.out.println(integerCalc.decToBin(100.1));





    }
}
