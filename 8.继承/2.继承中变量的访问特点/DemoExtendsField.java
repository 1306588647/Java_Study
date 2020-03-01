
/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。
 */

public class DemoExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();       //创建父类
        System.out.println(fu.numFu);       //只能使用父类的东西，没有子类的任何内容

        Zi zi = new Zi();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20

        System.out.println(zi.num);//优先用子类：200
//        System.out.println(zi.abc);//到处都没有，直接报错

        //这个方法是子类的，所以优先使用子类的，没有向上找
        zi.methodZi();//200

        //这个方法是父类当中定义的，
        zi.methodFu();//100




    }
}
