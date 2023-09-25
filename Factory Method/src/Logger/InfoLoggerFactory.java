package Logger;

public class InfoLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createObject(){
        return (ILogger) new InfoLogger();
    }
}
