package HeadFirst.StrategyPattern.duck;

import HeadFirst.StrategyPattern.fly.FlyNoWay;
import HeadFirst.StrategyPattern.quack.SliceQuack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        //todo 通过多态动态指定
        flyBehavior = new FlyNoWay();
        noiseBehavior = new SliceQuack();
    }

    public void display(){
        System.out.println("im a model HeadFirst.StrategyPattern ...");
    }
}