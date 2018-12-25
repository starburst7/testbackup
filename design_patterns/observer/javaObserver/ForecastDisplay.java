package javaObserver;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    Observable observable;
  
    
    public ForecastDisplay(Observable observerLink) {
        this.observable=observerLink;
        observerLink.addObserver(this);;
    }
    
    @Override
    public void display() {
        System.out.println("the fore cast is..."+temperature+", "+humidity+", "+humidity);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
            }
        
    }

}
