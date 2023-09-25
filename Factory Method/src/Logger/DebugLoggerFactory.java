package Logger;

public class DebugLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createObject(){
        return (ILogger) new DebugLogger();
    }
}
