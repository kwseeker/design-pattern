package top.kwseeker.internetWeather;

import top.kwseeker.internetWeather.mode.CurrentConditions;
import top.kwseeker.internetWeather.mode.ForcastConditions;
import top.kwseeker.internetWeather.mode.WeatherData;

public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(forcastConditions);

        weatherData.setData(30.0F, 150.0F, 40.0F);
        weatherData.removeObserver(currentConditions);
        weatherData.setData(33.0F, 140.0F, 50.0F);
    }
}
