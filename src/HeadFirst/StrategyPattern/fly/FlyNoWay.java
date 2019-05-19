package HeadFirst.StrategyPattern.fly;

public class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("can not fly");
    }
}
