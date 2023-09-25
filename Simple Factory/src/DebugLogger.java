public class DebugLogger implements ILogger{
    public void log(String message){
        System.out.println("DEBUG: " + message);
    }
}
