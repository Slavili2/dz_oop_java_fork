package Ex002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        Worker w1 = new Worker(28, "Иван","Иванов", 40, 150000);

        ParameterizedWorker<Integer> w2 = new ParameterizedWorker<Integer>(
                38, "Пётр","Петров", 37, 100000
        );
        System.out.println(w2.getId());
        String uid = UUID.randomUUID().toString();
        //System.out.println(uid);

        ParameterizedWorker<String> w3 = new ParameterizedWorker<>(
                uid, "John","Сидоров", 37, 100000);
        System.out.println(w3.getId());

        MultiParameterized<String, String, String> mp1 = new MultiParameterized<>(
                "Стринга 1","Стринга 2", "Стринга 3"
        );
        System.out.println(mp1.toString());


    }
}
