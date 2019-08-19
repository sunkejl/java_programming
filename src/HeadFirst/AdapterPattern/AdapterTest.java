package HeadFirst.AdapterPattern;


public class AdapterTest {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdpter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdpter);
        testDuck(duck);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}

//不用适配器，需要改写客户端代码来跳用新接口
//适配器模式，将一个类的接口，转换成客户期望的另一个接口  适配器让原本不兼容的类可以合作无间

//适配模式 充满良好的OO设计原则  使用对象组合，以修改的接口包装被适配者
//客户和接口绑定，而不是和实现绑定


