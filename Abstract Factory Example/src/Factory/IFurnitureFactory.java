package Factory;

import Component.FurnitureType;
import Component.IChair;
import Component.ISofa;

public interface IFurnitureFactory {
    public ISofa createSofa();
    public IChair createChair();

    public static IFurnitureFactory createFactory(FurnitureType furnitureType){
        switch (furnitureType){
            case MODERN -> {
                return new ModernFactory();
            }
            case TRADITIONAL -> {
                return new TraditionalFactory();
            }
            default -> {
                return null;
            }
        }
    }
}
