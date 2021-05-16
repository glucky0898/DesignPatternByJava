package observer.weather.bad_design;

import observer.weather.optimal_design.DisplayElement;
import observer.weather.optimal_design.Observer;
import observer.weather.optimal_design.Subject;
import observer.weather.optimal_design.WeatherData;

public class CurrentConditionDisplay{
    public void update(float temperature, float humidity, float pressure){
    }
    public void display() {
        System.out.print("Forecast: ");
    }
}
