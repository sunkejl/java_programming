package HeadFirst.ObserverPattern.dev;

import HeadFirst.ObserverPattern.DisplayElement;
import HeadFirst.ObserverPattern.Observer;
import HeadFirst.ObserverPattern.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);

    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("current temperature" + temperature +";humidity"+ humidity);
    }
}
