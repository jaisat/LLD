import Logger.ErrorLoggerFactory;
import Logger.ILogger;
import Logger.InfoLoggerFactory;
import Logger.ILoggerFactory;


public class Main {
    public static void main(String[] args) {

        ILoggerFactory infoLoggerFactory = new InfoLoggerFactory();
        ILogger infoLogger = infoLoggerFactory.createObject();
        infoLogger.log("Info Logs are Present");

        ILoggerFactory errorLoggerFactory = new ErrorLoggerFactory();
        ILogger errorLogger = errorLoggerFactory.createObject();
        errorLogger.log("Error Logs are Present");

    }
}