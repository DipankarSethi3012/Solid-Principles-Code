
public class Bird extends Animal implements FlyingAnimal {
    
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird is Flying");
    }
}
