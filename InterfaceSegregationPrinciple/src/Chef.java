public class Chef implements ChefInterface{
    @Override
    public void makeFood() {
        System.out.println("Chef is making the food");
    }

    @Override
    public void takeUniform() {
        System.out.println("Chef is taking the uniform");
    }
}
