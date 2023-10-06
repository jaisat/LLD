package Component;

public class Desktop {
    public String motherboard;
    public String processor;
    public String memory;
    public String storage;
    public String graphicsCard;

    public void setMotherboard(String motherboard){
        this.motherboard = motherboard;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }
    public void setMemory(String memory){
        this.memory = memory;
    }
    public void setStorage(String storage){
        this.storage = storage;
    }
    public void setGraphicsCard(String graphicsCard){
        this.graphicsCard = graphicsCard;
    }

    public String getMotherboard(){
        return this.motherboard;
    }

    public String getProcessor(){
        return this.processor;
    }

    public String getMemory(){
        return this.memory;
    }

    public String getStorage(){
        return this.memory;
    }

    public String getGraphicsCard(){
        return this.graphicsCard;
    }

    public void display(){
        System.out.println("MotherBoard => " + this.motherboard);
        System.out.println("Processor => " + this.processor);
        System.out.println("Memory  => " + this.memory);
        System.out.println("Storage  => " + this.storage);
        System.out.println("Graphics Card => " + this.graphicsCard);
    }
}
