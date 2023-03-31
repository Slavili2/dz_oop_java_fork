package calculator;

public class LoggerFactory  implements ICalculableFactory{


    @Override
    public Calculable create(String primaryArg) {
        //this.loggerMessage("Первое комплексное число: " + primaryArg);
        return new CalculatorWithLogger(primaryArg, new Logger());
    }
}
