package badpractice;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Snake();
        Animal animal1 = new Sparrow();

        animal.crawl();
        animal1.crawl();

        animal.eat();
        animal1.eat();

    }
}
//as the sparrow can't crawl breaking the behavior of the parent class