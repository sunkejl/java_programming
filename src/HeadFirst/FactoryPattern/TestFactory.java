package HeadFirst.FactoryPattern;

import HeadFirst.FactoryPattern.city.chicago.store.ChicagoPizzaStore;
import HeadFirst.FactoryPattern.city.la.store.LaPizzaStore;

//工厂方法 是抽象的 依赖子类来处理对象的创建
//创建者 和产品 都是抽象类 抽象类有 具体的子类  子类有特定的实现
//工厂方法 就是封装的关键
//工厂方法模式 定义一个创建对象的接口 子类决定实例化的类是哪一个 工厂方法把类的实例化推迟到子类
//简单工厂把全部事情在一个地方处理了
//工厂方法创建了一个框架，让子类决定如何实现
//简单工厂不具备工厂的弹性
//简单工厂不能变更正在创建的产品
//工厂方法 把创建对象的方法围起来
//工厂方法使用继承，把对象的创建委托给子类，子类实现工厂方法来创建对象(抽象工厂使用对象组合)
//工厂模式减少程序和具体列之间的依赖，松耦合

//依赖倒置原则 dependency inversion principle
//依赖抽象 不要依赖具体类  高层组件(pizza store) 和底层组件(ChicagoCheesePizza) 都依赖 pizza接口
public class TestFactory {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheese");

        PizzaStore pizzaStore1 = new LaPizzaStore();
        pizzaStore1.orderPizza("cheese");
    }
}
