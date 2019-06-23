package top.kwseeker.simpleFactory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("CheesePizza");
        System.out.println(name + " preparing");
    }
}
