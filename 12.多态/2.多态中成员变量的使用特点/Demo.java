
/*
访问成员变量的两种方式：
1.直接通过对象名称访问成员变量：等号左边是谁，优先用谁，没有则向上找
2.间接通过成员方法访问成员变量：该方法属于谁，优先用谁，没有则向上找
*/

public class Demo {

    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象

        Fu obj = new Zi();
        System.out.println(obj.num);//10

        //错误写法，age在Zi类中，由于查找Fu类没有age，就会向上找，不会向下找
        //System.out.println(obj.age);

        //子类没有覆盖重写，就是父：10
        //子类如果覆盖重写，就是子：20
        obj.showNum();
    }
}
