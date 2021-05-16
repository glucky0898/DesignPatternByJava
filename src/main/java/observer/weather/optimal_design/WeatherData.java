package observer.weather.optimal_design;

import java.util.concurrent.ConcurrentLinkedQueue;

public class WeatherData implements Subject{
    private ConcurrentLinkedQueue<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ConcurrentLinkedQueue<Observer>();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
        }
    }
    /**
    * 增加get方法，方便观察者"拉"数据
    * */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
