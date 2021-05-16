package observer.weather.bad_design;

import observer.weather.optimal_design.Observer;
import observer.weather.optimal_design.Subject;

import java.util.concurrent.ConcurrentLinkedQueue;

public class WeatherData{
    CurrentConditionDisplay currentConditionDisplay;
    ForecastDisplay forecastDisplay;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    public void measurementsChanged(float temperature, float humidity, float pressure){
        currentConditionDisplay.update(temperature,humidity,pressure);
        forecastDisplay.update(temperature,humidity,pressure);
    }
}
