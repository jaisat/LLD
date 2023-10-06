import Observers.Customer;
import Observers.Delivery;
import Observers.Observer;
import Observers.Restaurant;
import Order.Order;

public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order("12304", "Placed");

        Observer customer = new Customer();
        Observer delivery = new Delivery();
        Observer restaurant = new Restaurant();


        myOrder.addObserver(customer);
        myOrder.addObserver(delivery);
        myOrder.addObserver(restaurant);

        myOrder.setOrderStatus("Preparing");

        myOrder.setOrderStatus("Taken");

        myOrder.setOrderStatus("Delivered");


    }
}