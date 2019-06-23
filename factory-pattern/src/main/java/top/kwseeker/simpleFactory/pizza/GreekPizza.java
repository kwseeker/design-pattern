package top.kwseeker.simpleFactory.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("GreekPizza");
        System.out.println(name + " preparing");
    }
}
