package HeadFirst.FactoryPattern.city.chicago.store;


import HeadFirst.FactoryPattern.Pizza;
import HeadFirst.FactoryPattern.PizzaStore;
import HeadFirst.FactoryPattern.city.chicago.pizza.ChicagoCheesePizza;
import HeadFirst.FactoryPattern.city.chicago.pizza.ChicagoOtherPizza;

public class ChicagoPizzaStore  extends PizzaStore {

//工厂方法
   public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicagoCheesePizza();
        }else{
            return new ChicagoOtherPizza();
        }
    }
}
