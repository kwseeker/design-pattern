package top.kwseeker.abstractFactory2;

public class BenzFactory implements ICarFactory {

    @Override
    public Wheel productWheel() {
        System.out.println("生产奔驰轮胎");
        return new BenzWheel();
    }

    @Override
    public Engine productEngine() {
        System.out.println("生产奔驰发动机");
        return new BenzEngine();
    }
}
