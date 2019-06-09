package HeadFirst.FactoryPattern.city.la.pizza;

import HeadFirst.FactoryPattern.Pizza;

public class LaOtherPizza implements Pizza {
    public void prepare() {
        System.out.println("la other");
    }
}
