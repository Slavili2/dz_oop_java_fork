package calculator;

public interface Calculable {
    Calculable sum(String arg);
    Calculable multi(String arg);
    Calculable division(String arg);
    String getResult();

    int[] partComplexToArray(String arg);
}
