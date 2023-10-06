package Director;

import Builder.DesktopBuilder;
import Component.Desktop;

public class DesktopDirector {
    DesktopBuilder builder;

    public  DesktopDirector(DesktopBuilder builder){
        this.builder = builder;
    }

    public Desktop buildDesktop(){
        builder.buildGraphicsCard();
        builder.buildStorage();
        builder.buildMemory();
        builder.buildMotherboard();
        builder.buildProcessor();
        return builder.getDesktop();
    }
}
