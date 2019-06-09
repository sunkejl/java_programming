package HeadFirst.SimplePizzaFactory;

//简单工厂 不是设计模式 而是编程习惯
//实现接口，不是使用implement来实现接口，而是泛指 实现某个超类型(类或者接口)的某个方法
public class TestSimpleFactory {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheesee");
    }
}
