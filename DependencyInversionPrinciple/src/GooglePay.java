public class GooglePay implements PaymentInterface{
    @Override
    public void makePayment() {
        System.out.println("Google pay is making the payment");
    }
}
