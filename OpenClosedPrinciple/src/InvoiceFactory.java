public class InvoiceFactory {
    public  static Invoice getInvoice(String country) {
        return switch (country.toLowerCase()) {
            case "india" -> new IndiaInvoice();
            case "germany" -> new GermanyInvoice();
            default -> throw new RuntimeException("Not Valid");
        };
    }
}
