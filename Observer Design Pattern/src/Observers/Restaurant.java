package Observers;

import Order.Order;

public class Restaurant implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Restaurant Updated for Order Id: " + order.getOrderId() + " Order Status: " + order.getOrderStatus());
    }
}
