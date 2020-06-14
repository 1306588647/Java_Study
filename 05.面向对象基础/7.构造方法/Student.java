
/*
构造方法是专门用来创建对象的方法，我们通过关键字new来创建对象时，其实就是在调用构造犯法。
格式：
public 类名称（参数类型 参数名称）{
    方法体
}


注意事项：
1.构造方法的名称必须和所在类名称完全一样，就连大小写也要一样
2.构造方法不要写返回值类型
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数，方法体什么事情都不做
    public Student(){};
5.一旦编写了至少一个构造方法，那么编译器将不再赠送
6.构造方法也是可以重载的



*/


public class Student {

    private int age;
    private String name;
    public Student(){
        System.out.println("无惨构造方法执行啦！");
    }

    public Student(int age,String name){
        System.out.println("有参数构造方法执行啦！");
        this.age =age;
        this.name = name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setName(String Name){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }


}
