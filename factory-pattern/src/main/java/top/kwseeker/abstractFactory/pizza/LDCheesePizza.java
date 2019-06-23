package top.kwseeker.abstractFactory.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("LDCheesePizza");
        System.out.println(name + " preparing");
    }
}
