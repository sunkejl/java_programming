package HeadFirst.FactoryPattern;

public abstract class PizzaStore {
    // 不知道哪些实际具体类参与进来 这就是解耦 decouple
    public Pizza orderPizza(String type){
        Pizza pizza ;
        pizza =createPizza(type);
        pizza.prepare();
        return pizza;
    }

    //实现 自己的批萨风味
    //抽象的工厂方法 让子类实现此方法  制造产品
    //子类中才是真正的工厂方法 具体的创建者  产品就是pizza
    public abstract Pizza createPizza(String type);
}
