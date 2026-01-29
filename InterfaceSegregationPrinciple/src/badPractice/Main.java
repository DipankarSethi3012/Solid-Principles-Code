package badPractice;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.cook();
        waiter.serve();

        Chef chef = new Chef();
        chef.cook();
        chef.serve();
    }
}

//bad-practice both implementing the one interface, whats the need for chef to serve and waiter to cook
