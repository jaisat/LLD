import Components.Factory.GUIFactory;
import Components.Factory.IFactory;
import Components.IButton;
import Components.IText;
import Components.OsType;

public class Main {
    public static void main(String[] args) {
        IFactory macFactory = GUIFactory.createFactory(OsType.MAC);
        IButton macButton = macFactory.createButton();
        macButton.click();
        IText macText = macFactory.createText();
        macText.setText();

        IFactory windowsFactory = GUIFactory.createFactory(OsType.WINDOWS);
        IButton windowsButton = windowsFactory.createButton();
        windowsButton.click();
        IText windowsText = windowsFactory.createText();
        windowsText.setText();
    }
}