package javaObserver;

public class WeatherstationDriver {

    public static void main(String[] args) {
        
WeatherData weatherData=new WeatherData();



ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
ForecastDisplay CurrentConditionsDisplay = new ForecastDisplay(weatherData);
weatherData.setMeasurements(80, 65, 30.4f);
weatherData.setMeasurements(82, 70, 29.2f);
weatherData.setMeasurements(78, 90, 29.2f);
        

    }

}
