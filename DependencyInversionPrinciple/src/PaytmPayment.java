public class PaytmPayment implements PaymentInterface{
    @Override
    public void makePayment() {
        System.out.println("Paytm is making the payment");
    }
}
