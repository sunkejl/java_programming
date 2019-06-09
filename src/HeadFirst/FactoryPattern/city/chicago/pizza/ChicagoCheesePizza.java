package HeadFirst.FactoryPattern.city.chicago.pizza;

import HeadFirst.FactoryPattern.Pizza;

public class ChicagoCheesePizza implements Pizza {
    public void prepare() {
        System.out.println("chicago chesse");
    }
}
