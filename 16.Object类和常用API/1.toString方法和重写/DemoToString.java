import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object
    类 Object 是类层次结构的根(父)类。
    每个类(Person,Student...)都使用 Object 作为超(父)类。
    所有对象（包括数组）都实现这个类的方法。
 */
public class DemoToString {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类,所以可以使用Object类中的toString方法
        String toString() 返回该对象的字符串表示。
    */
        Person one = new Person("张三", 12);
        String s = one.toString();


        //1.当toString方法未被重写时
        System.out.println(s);//Person@6b71769e

        //直接打印对象的名字,其实就是调用对象的toString  p=p.toString();
        System.out.println(one);//Person@6b71769e

        //2.当toString方法被重写时
        System.out.println(s);
        System.out.println(one);

        System.out.println("============");
        //看一个类是否重写了toString,直接打印这个类的对象即可,
        // 如果没有重写toString方法那么打印的是对象的地址值(默认)
        //如果重写了toString方法，那么就按照重写的方式打印
        Random rand = new Random();
        System.out.println(rand);//java.util.Random@668bc3d5  没有重写toString方法

        Scanner scanf = new Scanner(System.in);
        System.out.println(scanf);//java.util.Scanner[delimiters=\p{javaWhitespace}...   重写toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1,2]   重写toString方法

    }


}
