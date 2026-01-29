package badpractice;

public class Sparrow extends Animal{
    @Override
    public void eat() {
        System.out.println("Eating ");
    }


    @Override
    public void crawl() {
        throw new RuntimeException("Sparrow Can't crawl");
    }
}
