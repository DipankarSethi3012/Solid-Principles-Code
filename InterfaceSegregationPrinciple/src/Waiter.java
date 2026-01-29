public class Waiter implements WaiterInterface{
    @Override
    public void takeOrder() {
        System.out.println("Waiter is taking the order");
    }

    @Override
    public void takeUniform() {
        System.out.println("Waiter is taking the uniform");
    }
}
