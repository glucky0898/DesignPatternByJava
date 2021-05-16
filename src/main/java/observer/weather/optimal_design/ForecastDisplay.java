package observer.weather.optimal_design;

public class ForecastDisplay implements Observer, DisplayElement {
	private WeatherData weatherData;
	private float currentPressure;
	private float lastPressure;
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(Subject subject){
		if(subject instanceof WeatherData){
			WeatherData data = (WeatherData)subject;
			this.weatherData = data;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
