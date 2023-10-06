import Components.NetworkDevices;
import Components.Router;

public class Main {
    public static void main(String[] args) {
        NetworkDevices routerDevice = new Router("Jenkins Router", "10.1.10.54");
        NetworkDevices clonedDevice = routerDevice.clone();

        routerDevice.display();
        clonedDevice.display();

    }
}