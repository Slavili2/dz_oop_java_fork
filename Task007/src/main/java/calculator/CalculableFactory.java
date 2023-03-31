package calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(String primaryArg) {
        return new Calculator(primaryArg);
    }
}
