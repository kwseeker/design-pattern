package top.kwseeker.abstractFactory2;

public class BMWFactory implements ICarFactory {

    @Override
    public Wheel productWheel() {
        System.out.println("生产宝马轮胎");
        return new BmwWheel();
    }

    @Override
    public Engine productEngine() {
        System.out.println("生产宝马发动机");
        return new BmwEngine();
    }
}
