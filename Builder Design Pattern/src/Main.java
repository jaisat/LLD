import Builder.DellDesktopBuilder;
import Builder.DesktopBuilder;
import Builder.HpDesktopBuilder;
import Component.Desktop;
import Director.DesktopDirector;

public class Main {
    public static void main(String[] args) {
//        DesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
//        DesktopDirector director = new DesktopDirector(dellDesktopBuilder);
//        Desktop desktop = director.buildDesktop();
//
//        desktop.display();

        DesktopBuilder builder = new HpDesktopBuilder();
        DesktopDirector director = new DesktopDirector(builder);
        Desktop desktop = director.buildDesktop();

        desktop.display();

    }
}