package badPractice;

public class Waiter implements Restaurant{
    @Override
    public void cook() {
        System.out.println("Waiter can't cook");
    }

    @Override
    public void serve() {
        System.out.println("Waiter is serving the food");
    }
}
