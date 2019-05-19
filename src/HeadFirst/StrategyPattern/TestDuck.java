package HeadFirst.StrategyPattern;

import HeadFirst.StrategyPattern.duck.Duck;
import HeadFirst.StrategyPattern.duck.ModelDuck;
import HeadFirst.StrategyPattern.duck.RealDuck;
import HeadFirst.StrategyPattern.fly.FlyNoWay;

//策略模式 定义算法族，分装起来，之间可以相互替换，算法的变化独立于使用算法的客户
public class TestDuck {
    public static void main(String[] args) {
        //IS-A
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        //HAS-A
        //行为(算法)
        //变化的地方 独立出来
        //针对接口编程（不针对实现编程）多态
        //composition 组合
        //多用组合 少用继承
        modelDuck.performFly();
        modelDuck.performQuack();

        Duck realDuck = new RealDuck();
        realDuck.display();
        realDuck.performFly();
        realDuck.performQuack();
        //运行时改变行为
        realDuck.setFlyBehavior(new FlyNoWay());
        realDuck.performFly();

    }
}
