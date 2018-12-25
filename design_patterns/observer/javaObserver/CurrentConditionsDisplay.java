package javaObserver;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
private float temperature;
private float humidity;
Observable observable;

public CurrentConditionsDisplay(Observable observableLink) {
    this.observable=observableLink;
    observableLink.addObserver(this);
    
}

@Override
public void update(float temperature, float humidity, float pressure) {
this.temperature = temperature;
this.humidity = humidity;
display();
}

public void display() {
System.out.println("Current conditions: " + temperature
+ "F degrees and " + humidity + "% humidity");
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
