package top.kwseeker.stimulateduck.duck;

import top.kwseeker.stimulateduck.behavior.flybehavior.BadFlyBehavior;
import top.kwseeker.stimulateduck.behavior.quackbehavior.GegeQuackBehavior;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GegeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("***My head is read***");
    }

}
