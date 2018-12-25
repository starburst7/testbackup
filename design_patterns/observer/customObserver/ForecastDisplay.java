package customObserver;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public ForecastDisplay(WeatherData w) {
        this.weatherData=w;
    }
    
    @Override
    public void display() {
        System.out.println("the fore cast is...");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

}
