public class SimpleFactory {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Factory Design Pattern");
        ILogger debugLogger = LoggerFactory.createObject(LogLevel.DEBUG);
        debugLogger.log("Hello I am Debug Log");
        ILogger errorLogger = LoggerFactory.createObject(LogLevel.ERROR);
        errorLogger.log("Hello I am ERROR Log");
        ILogger infoLogger = LoggerFactory.createObject(LogLevel.INFO);
        infoLogger.log("Hello I am Info Log");
    }
}