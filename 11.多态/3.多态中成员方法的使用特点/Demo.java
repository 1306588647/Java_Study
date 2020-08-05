
/*
在多态的代码中，成员方法的访问规则是：
看new的是谁，就优先用谁，没有则向上找。

口诀：编译看左边，运行看右边

对比一下：
成员变量：编译看左边，运行还看左边
成员方法：编译看左边，运行看右边
*/

public class Demo {
    public static void main(String[] args) {
        Fu obj = new ZI();//多态

        obj.method();//父子都有，优先用子，因为new的是子
        obj.methodFu();//子类没有，父类有，向上找到父类

        //编译看左边，左边是Fu，FU当中没有methodZi方法，所以编译报错
        //obj.methodZi();

        //运行看右边：首先看左边，左边Fu类有method，真正运行的时候，运行右边Zi中的method
        obj.method();
        //运行看右边：首先看左边，左边Fu类有methodFu，运行的时候，运行右边Zi中的methodFu，由于Zi类中没有，所以向上找
        obj.methodFu();
    }
}
