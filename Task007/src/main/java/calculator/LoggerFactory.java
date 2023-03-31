package calculator;

public class LoggerFactory  implements ICalculableFactory{


    @Override
    public Calculable create(String primaryArg) {
        return new CalculatorWithLogger(primaryArg, new Logger());
    }
}
