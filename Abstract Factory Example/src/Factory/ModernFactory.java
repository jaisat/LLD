package Factory;

import Component.IChair;
import Component.ISofa;
import Component.ModernChair;
import Component.ModernSofa;

public class ModernFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }
}
