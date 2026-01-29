public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Bird sparrow = new Sparrow();

//        lion.eat();
        lion.run();

        sparrow.eat();
        sparrow.fly();
    }
}

//as no one is breaking there parent functionality