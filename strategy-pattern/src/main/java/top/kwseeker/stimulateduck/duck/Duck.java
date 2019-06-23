package top.kwseeker.stimulateduck.duck;

import top.kwseeker.stimulateduck.behavior.flybehavior.FlyBehavior;
import top.kwseeker.stimulateduck.behavior.quackbehavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }


    public void swim() {
        System.out.println("~~~ I'm swim~~~");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
