package observer.weather.optimal_design;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private WeatherData weatherData;
    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(Subject subject){
        if(subject instanceof WeatherData){
            this.weatherData = weatherData;
            display();
        }
    }
    public void display(){
        System.out.println("Current conditions: " + weatherData.getTemperature()
                + "F degrees and " + weatherData.getHumidity() + "% humidity");
    }
}
