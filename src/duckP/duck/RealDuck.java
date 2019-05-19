package duckP.duck;

import duckP.fly.FlyWithWings;
import duckP.quack.NoiseQuack;

public class RealDuck extends Duck{
    public RealDuck(){
        flyBehavior = new FlyWithWings();
        noiseBehavior = new NoiseQuack();
    }

    public void display(){
        System.out.println("im a  real duckP ...");
    }
}