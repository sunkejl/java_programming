package HeadFirst.CommandPattern;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();//厂商的类
        LightOnCommand lightOn = new LightOnCommand(light);

        //遥控器的插槽，可用不同的参数
        //遥控器不在乎拥有什么命令对象 只要对象实现了command接口

        //工作队列类和计算的对象之间完全解耦，队列对象不在乎到底做什么，只知道取出命令对象，然后调用execute（）方法


        //客户创建一个command 并设置其接受者
        //调用者持有一个命令对象
        remote.setCommand(lightOn);
        //在某个时间点，调用命令对象的execute（）方法
        //调用者只要调用execute就可以发出请求
        remote.buttonWasPressed();//遥控器的类


        //命令模式 将发出请求的对象和执行请求的对象解耦
        //被解耦的俩者之间通过命令对象进行沟通，命令对象封装了接受者的一个或者一组动作
        //调用者通过调用命令对象的execute()发出请求，使接受者的动作被调用
    }
}
