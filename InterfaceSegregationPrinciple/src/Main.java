//import badPractice.Chef;

public class Main {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        waiter.takeUniform();
        waiter.takeOrder();

        Chef chef = new Chef();
        chef.makeFood();
        chef.takeUniform();
    }
}