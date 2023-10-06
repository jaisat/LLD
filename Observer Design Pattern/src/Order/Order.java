package Order;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String orderStatus;

    List<Observer> observers = new ArrayList<>();

    public Order(String orderId,String orderStatus){
        this.orderId = orderId;
        this.orderStatus = orderStatus;

    }

    public String getOrderId(){
        return this.orderId;
    }

    public String getOrderStatus(){
        return this.orderStatus;
    }

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
        this.notifyObservers();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
