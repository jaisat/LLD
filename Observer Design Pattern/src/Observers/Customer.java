package Observers;

import Order.Order;

public class Customer implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Customer Updated for Order Id: " + order.getOrderId() + " Order Status: " + order.getOrderStatus());
    }
}
