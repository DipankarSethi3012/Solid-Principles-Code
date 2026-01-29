package badpractice;

public class Invoice {
    public void printInvoice(String country) {
        if(country.equalsIgnoreCase("India")) {
            System.out.println("Printing India Invoice");
        } else if(country.equalsIgnoreCase("Australia")) {
            System.out.println("Printing Australia Invoice");
        } else if (country.equalsIgnoreCase("USA")) {
            System.out.println("Printing USA Invoice");
        } else {
            System.out.println("Invalid Country");
        }
    }
}

//bad-practice when the new country is added the existing code is being modified