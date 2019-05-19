package HeadFirst.StrategyPattern.duck;

import HeadFirst.StrategyPattern.fly.FlyBehavior;
import HeadFirst.StrategyPattern.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior noiseBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        noiseBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setNoiseBehavior(QuackBehavior noiseBehavior) {
        this.noiseBehavior = noiseBehavior;
    }

}
