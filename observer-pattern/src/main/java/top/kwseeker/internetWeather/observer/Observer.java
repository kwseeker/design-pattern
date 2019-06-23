package top.kwseeker.internetWeather.observer;

public interface Observer {
    //接收Subject的通知，执行后续的数据处理及展示操作
    void update(float temperature, float pressure, float humidity);
}
