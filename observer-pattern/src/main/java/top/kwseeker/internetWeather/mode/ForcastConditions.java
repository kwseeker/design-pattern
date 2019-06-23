package top.kwseeker.internetWeather.mode;

import top.kwseeker.internetWeather.observer.Observer;

//功能个性化的观察者
//预报未来天气的公告板
public class ForcastConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Tomorrow temperature: " + temperature);
        System.out.println("Tomorrow pressure: " + pressure);
        System.out.println("Tomorrow humidity: " + humidity);
    }
}
