package HeadFirst.ObserverPattern.origin;

import HeadFirst.ObserverPattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplayUtil implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplayUtil(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataUtil) {
            WeatherDataUtil weatherDataUtil = (WeatherDataUtil) obs;
            this.temperature = weatherDataUtil.getTemperature();
            this.humidity = weatherDataUtil.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("current temperature" + temperature + ";humidity" + humidity);
    }
}
