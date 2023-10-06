package Builder;

public class HpDesktopBuilder extends DesktopBuilder{
    @Override
    public void buildGraphicsCard() {
        desktop.setGraphicsCard("HP Graphics Card");
    }

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("HP Motherboard");
    }

    @Override
    public void buildMemory() {
        desktop.setMemory("HP memory");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("HP Processor");
    }

    @Override
    public void buildStorage() {
        desktop.setStorage("HP Storage");
    }
}
