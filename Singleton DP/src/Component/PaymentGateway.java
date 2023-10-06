package Component;

public class PaymentGateway{
    private static PaymentGateway paymentGatewayInstance;

    private PaymentGateway(){
        System.out.println("Gateway Initialized");
    }

    public static PaymentGateway getPaymentGatewayInstance(){
        if(paymentGatewayInstance == null){
            return paymentGatewayInstance = new PaymentGateway();
        }
        return paymentGatewayInstance;
    }
}