abstract class OrderProcessingTemplate{
    public void processOrder(){
        verifyOrder();
        assignDelivery();
        orderTracking();
    }
    abstract void verifyOrder();
    abstract void assignDelivery();
    abstract void orderTracking();
}

class LocalOrderProcessing extends OrderProcessingTemplate{

    @Override
    void verifyOrder() {
        System.out.println("Verify Local Order");
    }

    @Override
    void assignDelivery() {
        System.out.println("Assign Local Order");
    }

    @Override
    void orderTracking() {
        System.out.println("Order Tracking Local Order");
    }
}

class InternationalOrderProcessing extends OrderProcessingTemplate{

    @Override
    void verifyOrder() {
        System.out.println("Verify International Order");
    }

    @Override
    void assignDelivery() {
        System.out.println("Assign International Order");
    }

    @Override
    void orderTracking() {
        System.out.println("Track International Order");
    }
}

public class Main {
    public static void main(String[] args) {
        OrderProcessingTemplate localOrder = new LocalOrderProcessing();
        OrderProcessingTemplate internationalOrder = new InternationalOrderProcessing();

        localOrder.processOrder();
        internationalOrder.processOrder();
    }
}