
/*
一旦使用static修饰成员方法，那么就成为了静态方法，静态方法不属于对象，而是属于整个类

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。

无论是成员变量，还是成员方法，如果有static，都推荐使用类名称进行调用。
静态变量：类名称.静态变量
静态方法：类名称.静态方法()



注意事项
1.静态只能直接访问静态，不能直接访问非静态
原因：因为在内存中，【先】有的静态内容，【后】有的非静态内容
“先人不知后人，后人知道先人”

2.静态方法不能写this关键字



*/

public class StaticMethod {
    public static void main(String[] args) {

        MyClass obj = new MyClass();//首先创建对象
        obj.method();//然后才能使用没有static关键字的内容

        //对于静态方法来说，可以通过对对象名进行调用，也可以直接通过类名称来调用。
        obj.methodStatic();//正确，不推荐，这种写法在变异之后也会被javac翻译成"类名称.静态方法"
        MyClass.methodStatic();//正确，推荐


        //对于本类当中的静态方法，可以是省略类名称
        myMethod();
        StaticMethod.myMethod();//完全等效


    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
