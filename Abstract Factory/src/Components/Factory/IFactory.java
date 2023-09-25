package Components.Factory;

import Components.IButton;
import Components.IText;

public interface IFactory {
    public IButton createButton();
    public IText createText();
}
