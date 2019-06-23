package top.kwseeker.internetWeather.mode;

import top.kwseeker.internetWeather.observer.Observer;

//功能个性化的观察者
//报告实时天气的公告板
public class CurrentConditions implements Observer {

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
        System.out.println("Today temperature: " + temperature);
        System.out.println("Today pressure: " + pressure);
        System.out.println("Today humidity: " + humidity);
    }
}
