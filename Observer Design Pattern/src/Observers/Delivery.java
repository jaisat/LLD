package Observers;

import Order.Order;

public class Delivery implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Delivery Updated for Order Id: " + order.getOrderId() + " Order Status: " + order.getOrderStatus());
    }
}
