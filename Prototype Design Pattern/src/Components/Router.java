package Components;

public class Router extends NetworkDevices{
    private String name;
    private String ipAddress;

    public Router(String name, String ipAddress){
        this.name = name;
        this.ipAddress = ipAddress;
    }
    @Override
    public NetworkDevices clone() {
        return new Router(name, ipAddress);
    }

    @Override
    public void display() {
        System.out.println("IP Address -> " + ipAddress);
        System.out.println("Name -> " + name);
    }
}
