package duckP.duck;

import duckP.fly.FlyBehavior;
import duckP.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior noiseBehavior;

    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        noiseBehavior.quack();
    }
}
