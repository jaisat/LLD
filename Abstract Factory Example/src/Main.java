import Component.FurnitureType;
import Component.IChair;
import Component.ISofa;
import Factory.IFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        IFurnitureFactory modernFactory = IFurnitureFactory.createFactory(FurnitureType.MODERN);
        ISofa modernSofa = modernFactory.createSofa();
        IChair modernChair = modernFactory.createChair();
        modernSofa.sitOn();
        modernChair.place();

        IFurnitureFactory traditionalFactory = IFurnitureFactory.createFactory(FurnitureType.TRADITIONAL);
        ISofa traditionalSofa = traditionalFactory.createSofa();
        IChair traditionalChair = traditionalFactory.createChair();

        traditionalSofa.sitOn();
        traditionalChair.place();
    }
}