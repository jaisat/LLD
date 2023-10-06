package Builder;

public class DellDesktopBuilder extends DesktopBuilder{
    @Override
    public void buildGraphicsCard() {
        desktop.setGraphicsCard("Dell Graphics Card");
    }

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("Dell Motherboard");
    }

    @Override
    public void buildMemory() {
        desktop.setMemory("Dell memory");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Dell Processor");
    }

    @Override
    public void buildStorage() {
        desktop.setStorage("Dell Storage");
    }
}
