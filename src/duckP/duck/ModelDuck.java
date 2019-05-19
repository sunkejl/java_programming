package duckP.duck;

import duckP.fly.FlyNoWay;
import duckP.quack.SliceQuack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        noiseBehavior = new SliceQuack();
    }

    public void display(){
        System.out.println("im a model duckP ...");
    }
}