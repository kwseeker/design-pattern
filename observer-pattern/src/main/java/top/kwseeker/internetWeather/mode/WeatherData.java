package top.kwseeker.internetWeather.mode;

import top.kwseeker.internetWeather.observer.Observer;
import top.kwseeker.internetWeather.observer.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;
    //每个Subject维护一个Observer名单
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    //获取气象站仪器数据的接口
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private float getTemperature() {
        return temperature;
    }

    private float getPressure() {
        return pressure;
    }

    private float getHumidity() {
        return humidity;
    }

    //数据改变通知观察者接口
    private void dataChange() {
        notifyObservers();
    }

    //添加删除通知观察者方法实现
    @Override
    public void registerObserver(Observer observer) {
        observers .add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }

}
