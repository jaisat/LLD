interface PaymentStrategy{
    void processPayment(String amount);
}

class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(String amount) {
        System.out.println("Credit Card => " + amount);
    }
}

class PayPalPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(String amount) {
        System.out.println("PayPal => " + amount);
    }
}

class CryptoPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(String amount) {
        System.out.println("Crypto => " + amount);
    }
}

class PaymentStrategyFactory{
    public static PaymentStrategy createPaymentStrategy(String paymentMethod){
        if(paymentMethod.equals("CreditCard")){
            return new CreditCardPaymentStrategy();
        }
        if(paymentMethod.equals("PayPal")){
            return new PayPalPaymentStrategy();
        }
        if(paymentMethod.equals("Crypto")){
            return new CryptoPaymentStrategy();
        }else{
            return new CreditCardPaymentStrategy();
        }
    }
}

class PaymentProcessor{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(String paymentMethod) {
        paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(paymentMethod);
    }

    public void processPayment(String amount){
        if(paymentStrategy != null){
            paymentStrategy.processPayment(amount);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy("Crypto");
        processor.processPayment("60K");
    }
}