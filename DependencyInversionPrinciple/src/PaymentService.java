public class PaymentService {
    private PaymentInterface paymentInterface;
    PaymentService(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void makePayment() {
       paymentInterface.makePayment();
    }
}
