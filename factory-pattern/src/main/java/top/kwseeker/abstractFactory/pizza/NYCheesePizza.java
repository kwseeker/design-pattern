package top.kwseeker.abstractFactory.pizza;

public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("NYCheesePizza");
        System.out.println(name + " preparing");
    }
}
