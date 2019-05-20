package HeadFirst.ObserverPattern;

import HeadFirst.ObserverPattern.dev.CurrentConditionDisplay;
import HeadFirst.ObserverPattern.dev.WeatherData;
import HeadFirst.ObserverPattern.origin.CurrentConditionDisplayUtil;
import HeadFirst.ObserverPattern.origin.WeatherDataUtil;

//主题和观察者是松耦合，一方出现改变，不会影响另一方,应对变化，对象间的依赖降到最低
//protected导致必须继承，无法组合
//为交互对象的松耦合而设计
//观察者模式 对象间定义一对多的依赖，当一个对象改变状态，依赖的对象都会收到通知，自动更新
public class test {
     public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1,3,5);

         WeatherDataUtil weatherDataUtil = new WeatherDataUtil();

         CurrentConditionDisplayUtil currentConditionDisplayUtil = new CurrentConditionDisplayUtil(weatherDataUtil);
         weatherDataUtil.setMeasurements(22,44,66);
//         currentConditionDisplayUtil.update(weatherDataUtil,2);
    }
}

