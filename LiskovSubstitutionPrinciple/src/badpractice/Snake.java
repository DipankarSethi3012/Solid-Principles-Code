package badpractice;

public class Snake extends Animal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }


    @Override
    public void crawl() {
        System.out.println("Crawling");
    }
}
