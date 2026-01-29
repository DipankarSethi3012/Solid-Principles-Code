package badPractice;

public class PaymentService {
    Paytm paytm = new Paytm();
    public void makePayment() {
        paytm.makePayment();
    }
}


//Here the payment is high level module that is depends on the low level module, do bad practice