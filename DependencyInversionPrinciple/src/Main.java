

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new GooglePay());
        paymentService.makePayment();

        PaymentService paymentService1 = new PaymentService(new PaytmPayment());
        paymentService1.makePayment();
    }
}