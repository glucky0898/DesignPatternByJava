package observer.weather.optimal_design;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestObserver {
    private Logger logger = LoggerFactory.getLogger(TestObserver.class);
    @Test
    public void test(){
        WeatherData data = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(data);
        ForecastDisplay forecastDisplay = new ForecastDisplay(data);
        data.setMeasurements(80, 65, 30.4f);
        data.setMeasurements(82, 70, 29.2f);
        data.setMeasurements(78, 90, 29.2f);
    }

}
