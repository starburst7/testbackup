package javaObserver;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    @Override
    public void display() {
        System.out.println("show some other form of calculated numbers to 3rd party");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

}
