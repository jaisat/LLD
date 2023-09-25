package Factory;

import Component.IChair;
import Component.ISofa;
import Component.TraditionalChair;
import Component.TraditionalSofa;

public class TraditionalFactory implements IFurnitureFactory{
    @Override
    public ISofa createSofa() {
        return new TraditionalSofa();
    }

    @Override
    public IChair createChair() {
        return new TraditionalChair();
    }
}
