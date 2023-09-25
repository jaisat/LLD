package Components.Factory;

import Components.*;

public class MacFactory implements IFactory {

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public IText createText() {
        return new MacText();
    }
}
