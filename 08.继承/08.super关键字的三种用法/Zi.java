/*
super关键字的用法有三种：
1.在子类成员方法中，访问父类的成员变量
2.在子类成员方法中，访问父类的成员方法
3.在子类构造方法中，访问父类的构造方法
*/

public class Zi extends Fu {

    int num=10;

    public Zi(){
        System.out.println("子类构造方法！");
    }

    public void method(){
        super.method();//访问父类的method方法
        System.out.println("子类方法！");
    }

    public void methodZi(){
        System.out.println(super.num);//父类中的num
    }
}
