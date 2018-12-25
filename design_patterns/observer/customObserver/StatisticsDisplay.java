package customObserver;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public StatisticsDisplay(WeatherData w) {
        this.weatherData=w;
    }
    
    @Override
    public void display() {
        System.out.println("Average conditions:  "+ temperature
                + "F degrees and " + humidity + "% humidity");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
}
