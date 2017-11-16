单例模式确保某一个类只有一个实例,并且自行实例化并向整个系统提供这个实例.

如资源管理器, 访问存放配置文件的类,log,httpApplication.
通常Singleton模式有几种形式:

一: 使用全局变量
```
//Singleton with final field 
public class Singleton
{
    public static final Singleton instance = new Singleton();
    
    private Singleton(){}
    
    ...
}
```
在这种方法中，公有静态成员是一个final域（保证了总是包含相同的对象引用）。私有构造函数仅被调用一次，用来实例化公有的静态final域 Singleton.uniqueInstance。由于缺少公有的或者受保护的构造函数，所以保证了Singleton的全局唯一性：一旦 Singleton类被实例化之后，只有一个Singleton实例存在——不多也不少。使用此Singleton类的程序员的任何行为都不能改变这一点。

二: 使用公有的静态工厂方法(又叫饿汉式单例类)
```
//Singleton with static factory   
public class Singleton {   
    private static Singleton uniqueInstance = new Singleton();   
    private Singleton(){   
    }   
    public static Singleton getInSingleton(){   
        return uniqueInstance;   
    }   
    //...Remainder omitted   
}  
```
三: 延迟实例化的做法,也是公有的静态工厂方法(又叫懒汉式单例类)
```
public class Singleton{
    private static Singleton instance = null;

    private Singleton(){
        //to do
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
```
懒汉式以时间换取空间,每次获取实例都要判断,浪费时间,但是如果一直没人用,就会节省空间.饿汉式以空间换取时间,当类装载时,创建出一个实例,运行时不需要判断,节省了运行时间

四: 延迟实例化的做法,也是公有的静态工厂方法(又叫懒汉式单例类),并且线程安全
```
public class Singleton {   
    private static Singleton uniqueInstance ; 
  
    private Singleton(){   
    } 
  
    public synchronized static Singleton getInSingleton(){   
        if(uniqueInstance == null){   
            uniqueInstance = new Singleton();   
        }   
        return uniqueInstance;   
    }   
}  
```
五: Sington类的序列化 
```
public class Singleton implements Serializable{      
     
    private static final long serialVersionUID = 5765648836796281035L;      
    public static final Singleton uniqueInstance = new Singleton();      
    private Singleton(){      
    }      
    //...Remainder omitted      
    public static void main(String[] args) throws Exception{      
        //序列化      
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Singleton.obj"));      
         Singleton singleton = Singleton.uniqueInstance;               
         objectOutputStream.writeObject(singleton);      
         objectOutputStream.close();      
         //反序列化      
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Singleton.obj"));      
         Singleton singleton2 = (Singleton)objectInputStream.readObject();      
         objectInputStream.close();      
         //比较是否原来的实例      
         System.out.println(singleton==singleton2);      
   }       
}
``` 
输出结果为:false

解决方法是为Singleton类增加readResolve()方法：

Java代码
```
    //readResolve 方法维持了Singleton的单例属性  
    private Object readResolve() throws ObjectStreamException{  
        return uniqueInstance;  
    } 
```
再进行测试：输出结果为true 

总:
某些情况下使用单例模式可以节省资源,但是单例模式不只是为了节省资源,它是为了确保在整个应用期间只有一个实例, 以达到用户的特定使用目的.
单例模式也有一些坏处,首先,它扩展困难因为静态函数不能生成子类的实例, 所以如果扩展,只能重写.
隐式使用使结构不是很清晰.
可能导致内存泄露.
如果你的类希望以后能得到很好的扩展,最好不用单例模式.