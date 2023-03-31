package calculator;

public class Logger implements ILogger{
    @Override
    public void loggerMessage(String message) {
        System.out.println(message);
    }
}
