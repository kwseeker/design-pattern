package top.kwseeker.simpleFactory.pizza;

public class ChinesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("ChinesePizza");
        System.out.println(name + " preparing");
    }
}
