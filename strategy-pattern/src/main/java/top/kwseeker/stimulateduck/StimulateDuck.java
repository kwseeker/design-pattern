package top.kwseeker.stimulateduck;

import top.kwseeker.stimulateduck.behavior.flybehavior.NoFlyBehavior;
import top.kwseeker.stimulateduck.behavior.quackbehavior.NoQuackBehavior;
import top.kwseeker.stimulateduck.duck.Duck;
import top.kwseeker.stimulateduck.duck.GreenHeadDuck;
import top.kwseeker.stimulateduck.duck.RedHeadDuck;

public class StimulateDuck {

    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.fly();
        greenHeadDuck.quack();
        greenHeadDuck.swim();

        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.swim();

        redHeadDuck.setFlyBehavior(new NoFlyBehavior());
        redHeadDuck.setQuackBehavior(new NoQuackBehavior());
        redHeadDuck.fly();
        redHeadDuck.quack();
    }

}
