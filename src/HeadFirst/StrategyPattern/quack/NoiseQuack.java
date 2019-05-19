package HeadFirst.StrategyPattern.quack;

public class NoiseQuack implements QuackBehavior{
    public void quack(){
        System.out.println("noise");
    }
}
