package Components.Factory;

import Components.OsType;

public class GUIFactory {
    public static IFactory createFactory(OsType osType){
        switch (osType){
            case MAC:
                return new MacFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                return null;
        }
    }
}
