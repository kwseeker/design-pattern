package top.kwseeker.abstractFactory2;

public class Main {

    public static void main(String[] args) {
        ICarFactory carFactory = new BenzFactory();
        Wheel wheel = carFactory.productWheel();
        Engine engine = carFactory.productEngine();
        wheel.info();
        engine.info();
    }
}
