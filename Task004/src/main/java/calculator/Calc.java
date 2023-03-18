package calculator;

import java.util.List;

public class Calc <T extends Integer>{
    public Calc() {
    }

    public Double sum(List<T> items){
        Double sum = 0.0;
        for (T i: items) {
            sum += i.doubleValue();
        }
        return sum;
    }

    public Double multiplication(T item1, T item2){
        return item1.doubleValue()*item2.doubleValue();
    }

    public Double multiplicationArray(List<T> uList){
        Double result = 1.0;

        for (T item: uList
             ) {
            result*=item.doubleValue();
        }
        return result;
    }

    public Double division(T delimoe, T delitel){
        return delimoe.doubleValue()/delitel.doubleValue();
    }

    public String decToBin(T item){
        String result = "";
        for (int i = item.intValue(); i > 0 ; i/=2) {
                result =i%2 + result;
        }
        return result;
    }

    public String decToBin(String item){
        String result = "";
        try {
            for (int i = Integer.parseInt(item); i > 0  ; i/=2) {
                result =i%2 + result;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public String decToBin(Double item){
        String result = "";
        try {
            for (int i = item.intValue(); i > 0  ; i/=2) {
                result =i%2 + result;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
