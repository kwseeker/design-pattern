package top.kwseeker.stimulateduck.behavior.quackbehavior;

public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("___No quack___");
    }
}
