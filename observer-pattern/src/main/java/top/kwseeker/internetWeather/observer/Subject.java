package top.kwseeker.internetWeather.observer;

//添加、删除及通知观察者
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
