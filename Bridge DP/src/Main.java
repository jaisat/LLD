interface NavigationImplementation{
    void navigateTo(String dest);
}


interface NavigationSystem{
    void navigate();
}

class UberRide implements NavigationSystem{
    public String driver;
    private NavigationImplementation navigationImplementation;

    public UberRide(String driver){
        this.driver = driver;
    }

    public void setNavigationImplementation(NavigationImplementation navigationImplementation) {
        this.navigationImplementation = navigationImplementation;
    }

    @Override
    public void navigate() {
        System.out.println("Uber Ride using Navigation : " );
        navigationImplementation.navigateTo("Mirzapur");
    }
}

class UberEats implements NavigationSystem{
    public String restaurantName;
    private NavigationImplementation navigationImplementation;

    public UberEats(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public void setNavigationImplementation(NavigationImplementation navigationImplementation) {
        this.navigationImplementation = navigationImplementation;
    }

    @Override
    public void navigate() {
        System.out.println("Uber Eats using Navigation: ");
        navigationImplementation.navigateTo("kanpur");
    }
}

class GoogleMaps implements NavigationImplementation{

    @Override
    public void navigateTo(String dest) {
        System.out.println("Navigating by Google Maps to " + dest);
    }
}

class AppleMaps implements NavigationImplementation{

    @Override
    public void navigateTo(String dest) {
        System.out.println("Navigating by Apple Maps to : " + dest);
    }
}

public class Main {
    public static void main(String[] args) {
        UberRide uberRide = new UberRide("Suresh");
        UberEats uberEats = new UberEats("Sichuan");

        GoogleMaps gm = new GoogleMaps();
        AppleMaps am = new AppleMaps();
        uberRide.setNavigationImplementation(gm);
        uberEats.setNavigationImplementation(am);

        uberRide.navigate();

        uberEats.navigate();
    }
}