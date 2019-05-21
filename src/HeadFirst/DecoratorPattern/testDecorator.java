package HeadFirst.DecoratorPattern;


//对扩展开放，对修改关闭
//每个地方都采用开放关闭原则，是一种浪费，导致代码复杂难以理解
//对象可以在任何情况下被装饰
//装饰者模式 东戴的将责任附加到对象上，比继承更好的扩展功能
//装饰者 有一群装饰者来包装具体类
//可以用无数的装饰者来包装一个组件

public class testDecorator {
     public static void main(String[] args) {
            Beverage berverage = new Espresso();
            berverage = new Mocha(berverage);
            berverage = new Mocha(berverage);
         System.out.println(berverage.getDescription()+"$:"+berverage.cost());
    }
}

