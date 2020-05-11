
/*
在任何java的版本中，接口都可以定义抽象方法

public abstract 返回值类型 方法名称(参数列表);


注意方法：
1.接口当中的抽象方法，修师傅必须是两个固定的关键字：public abstract
2.这两个关键字修饰符，可以选择性的省略（不推荐）
3.方法的三要素，可以随意定义：方法返回值类型、方法名、方法参数


接口使用步骤：
1.接口不能直接使用，必须有一个 “实现类” 来 “实现” 该接口
格式：
public class 实现类名称 implements 接口名称{
    //...
}
2.接口的实现类必须覆盖重写接口中所有的抽象方法。
实现：去掉abstract关键字，加上方法体大括号。
3.创建实现类的对象，进行使用。


注意事项：
如果实现类并没有覆盖重写接口中所有的抽象方法，那么这实现类自己就必须是抽象类。

*/
public interface MyInterfaceAbstract {

    //这是一个抽象方法
    public abstract void methodAbstract1();

    //以下写法不推荐

    //这也是抽象方法
    abstract void methodAbstract2();

    //这也是抽象方法
    public void methodAbstract3();

    //这也是抽象方法
    void methodAbstract4();
}
