public class Main {
    public static void main(String[] args) {

        Invoice indiaInvoice = new IndiaInvoice();
        indiaInvoice.printInvoice();

        Invoice germanyInvoice = new GermanyInvoice();
        germanyInvoice.printInvoice();


    }
}
//if we have to add the new country we can add without modifying the existing code.
//we can extend the code without modifying the current code