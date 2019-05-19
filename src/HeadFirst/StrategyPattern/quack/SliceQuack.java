package HeadFirst.StrategyPattern.quack;

public class SliceQuack implements QuackBehavior{
    public void quack(){
        System.out.println("slice");
    }
}
