package badPractice;

public class Chef implements Restaurant{
    @Override
    public void cook() {
        System.out.println("ChefInterface is cooking the food");
    }

    @Override
    public void serve() {
        System.out.println("ChefInterface can't serve");
    }
}
