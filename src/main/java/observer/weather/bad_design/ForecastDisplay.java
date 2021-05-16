package observer.weather.bad_design;

public class ForecastDisplay{
	public void update(float temperature, float humidity, float pressure){
	}
	public void display() {
		System.out.print("Forecast: ");
	}
}
