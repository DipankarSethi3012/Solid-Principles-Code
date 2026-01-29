public class Snake extends Animal  implements CrawlingAnimal{

    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void crawl() {
        System.out.println("Snake is crawling");
    }
}
