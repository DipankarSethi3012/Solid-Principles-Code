public class Main {
    public static void main(String[] args) {

      Invoice invoice = InvoiceFactory.getInvoice("India");
      Invoice invoice1 = InvoiceFactory.getInvoice("Germany");

      invoice.printInvoice();
      invoice1.printInvoice();


    }
}
//if we have to add the new country we can add without modifying the existing code.
//we can extend the code without modifying the current code