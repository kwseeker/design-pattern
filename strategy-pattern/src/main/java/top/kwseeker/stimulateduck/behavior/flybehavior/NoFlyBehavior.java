package top.kwseeker.stimulateduck.behavior.flybehavior;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("---No fly---");
    }
}
