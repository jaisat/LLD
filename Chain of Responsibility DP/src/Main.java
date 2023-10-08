
abstract class OrderHandler{
    protected OrderHandler successor;
    public OrderHandler(OrderHandler successor){
        this.successor = successor;
    }
    abstract void processOrder(String order);
}

class OrderValidationHandler extends OrderHandler{
    public OrderValidationHandler(OrderHandler successor){
        super(successor);
    }

    @Override
    void processOrder(String order) {
        System.out.println("Handling Currently by Order Validation " + order);

        if(this.successor != null){
            successor.processOrder(order);
        }
    }
}

class PaymentProcessingHandler extends OrderHandler{
    public PaymentProcessingHandler(OrderHandler successor){
        super(successor);
    }

    @Override
    void processOrder(String order) {
        System.out.println("Handling Currently by Payment Processing " + order);

        if(this.successor != null){
            successor.processOrder(order);
        }
    }
}

class OrderPreparationHandler extends OrderHandler{
    public OrderPreparationHandler(OrderHandler successor){
        super(successor);
    }

    @Override
    void processOrder(String order) {
        System.out.println("Handling Currently by Order Preparation " + order);

        if(this.successor != null){
            successor.processOrder(order);
        }
    }
}

class DeliveryAssignmentHandler extends OrderHandler{
    public DeliveryAssignmentHandler(OrderHandler successor){
        super(successor);
    }

    @Override
    void processOrder(String order) {

        System.out.println("Handling Currently by Delivery " + order);

        if(this.successor != null){
            successor.processOrder(order);
        }
    }
}

class OrderTrackingHandler extends OrderHandler{
    public OrderTrackingHandler(OrderHandler successor){
        super(successor);
    }

    @Override
    void processOrder(String order) {

        System.out.println("Handling Currently by Order Tracking " + order);

        if(this.successor != null){
            successor.processOrder(order);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OrderHandler orderHandler = new OrderValidationHandler(new PaymentProcessingHandler( new OrderPreparationHandler( new DeliveryAssignmentHandler( new OrderTrackingHandler(null)))));
        orderHandler.processOrder("Pizza");
    }
}