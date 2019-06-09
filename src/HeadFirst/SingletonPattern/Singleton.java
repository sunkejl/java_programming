package HeadFirst.SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance;
    //构造器必须是私有的
    private Singleton(){
    }
    //增加synchronized 每个线程进入这个方法前 等别的线程离开该方法 不会有俩个线程同时进入这个方法
    public static synchronized Singleton getInstance(){
        //如果不需要这个实例，就永远不会产生
        //延迟实例化 lazy instance
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
