package top.kwseeker.abstractFactory.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDPepperPizza");
        System.out.println(name + " preparing");
    }
}
