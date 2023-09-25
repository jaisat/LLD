package Logger;

public class ErrorLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createObject(){
        return (ILogger) new ErrorLogger();
    }
}
