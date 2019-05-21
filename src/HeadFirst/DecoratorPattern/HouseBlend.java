package HeadFirst.DecoratorPattern;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "house blend coffer";
    }
    public double cost(){
        return 2.99;
    }
}
