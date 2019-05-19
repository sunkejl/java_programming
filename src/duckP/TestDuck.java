package duckP;

import duckP.duck.Duck;
import duckP.duck.ModelDuck;
import duckP.duck.RealDuck;

public class TestDuck {
    public static void main(String[] args){
        Duck modelDuck= new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        Duck realDuck= new RealDuck();
        realDuck.display();
        realDuck.performFly();
        realDuck.performQuack();

    }
}
