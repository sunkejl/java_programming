package HeadFirst.StrategyPattern.duck;

import HeadFirst.StrategyPattern.fly.FlyWithWings;
import HeadFirst.StrategyPattern.quack.NoiseQuack;

public class RealDuck extends Duck{
    public RealDuck(){
        //todo 通过多态动态指定
        flyBehavior = new FlyWithWings();
        noiseBehavior = new NoiseQuack();
    }

    public void display(){
        System.out.println("im a  real HeadFirst.StrategyPattern ...");
    }
}