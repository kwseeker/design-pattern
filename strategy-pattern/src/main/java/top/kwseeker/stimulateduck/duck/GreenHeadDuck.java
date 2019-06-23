package top.kwseeker.stimulateduck.duck;

import top.kwseeker.stimulateduck.behavior.flybehavior.GoodFlyBehavior;
import top.kwseeker.stimulateduck.behavior.quackbehavior.GagaQuackBehavior;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GagaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("***My head is green***");
    }
}
