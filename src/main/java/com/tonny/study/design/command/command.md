* 命令模式将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
* 命令模式的本质是对命令进行封装，将发出命令的责任和执行命令的责任分割开，实现二者之间的松耦合。

类图：
## ![](./command.gif)


## 模式结构：
* Command: 定义命令的接口，声明执行的方法。
* ConcreteCommand: 命令接口实现对象，通常会持有接受者，并调用接受者的功能来完成命令要执行的操作。
* Receiver: 接收者，真正执行命令的对象。任何类都可能成为一个接收者,只要它能够实现命令要求的相应功能。
* Invoker: 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
* Client: 创建具体的命令对象，并且设置命令对象的接收者。注意这个不是我们常规意义上的客户端，而是在组装命令对象和接收者，也可以称为装配者，真正使用命令的客户端是从Invoker来触发执行。

实例：
> public class Receiver
>{
>    public void action()
>    {
>        System.out.println("Receive something, run action");
>    }
>}

>public interface Command
>{
>    public void execute();
>}

>public class ConcreteCommand implements Command
>{
>    private Receiver receive = null;
>
>　 private String status;
>
>    public ConcreteCommand(final Receiver receive)
>    {
>        this.receive = receive;
>    }
>
>    @Override
>    public void execute()
>    {
>        this.receive.action();
>    }
>
>}
>
>public class Invoker
>{
>    private Command command = null;
>
>    public Command getCommand()
>    {
>        return command;
>    }
>
>    public void setCommand(final Command command)
>    {
>        this.command = command;
>    }
>
>    public void runCommand()
>    {
>        this.command.execute();
>    }
>}
>
>public class Client
>{
>    public static void assemble()
>    {
>        final Receiver receiver = new Receiver();
>        final Command command = new ConcreteCommand(receiver);
>        final Invoker invoker = new Invoker();
>        invoker.setCommand(command);
>        invoker.runCommand();
>    }
>
>    public static void main(final String[] args)
>    {
>        assemble();
>    }
>}

结果：
* Receive something, run action

优点：
* 降低系统的耦合度
* 新的命令可以很容易地加入到系统中
* 可以比较容易地设计一个组合命令

缺点：
* 使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个命令都需要设计一个具体命令类，因此某些系统可能需要大量具体命令类，这将影响命令模式的使用。

适用环境：
* 系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
* 系统需要在不同的时间指定请求，将请求排队和执行请求。
* 系统需要支持命令的撤销和恢复操作。
* 系统需要将一组操作组合在一起，即支持宏命令。