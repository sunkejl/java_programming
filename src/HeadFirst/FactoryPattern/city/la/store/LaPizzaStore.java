package HeadFirst.FactoryPattern.city.la.store;


import HeadFirst.FactoryPattern.Pizza;
import HeadFirst.FactoryPattern.PizzaStore;
import HeadFirst.FactoryPattern.city.la.pizza.LaCheesPizza;
import HeadFirst.FactoryPattern.city.la.pizza.LaOtherPizza;

public class LaPizzaStore extends PizzaStore {


   public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new LaCheesPizza();
        }else{
            return new LaOtherPizza();
        }
    }
}
