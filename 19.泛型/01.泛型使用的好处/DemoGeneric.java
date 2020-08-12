import java.util.ArrayList;
import java.util.Iterator;

public class DemoGeneric {
    public static void main(String[] args) {
        method2();
    }

    public static void method1(){
        /*
        创建集合对象,不使用泛型
        好处:
            集合不使用泛型,默认的类型就是Object类型,可以存储任意类型的数据
        弊端:
            不安全,会引发异常
     */
        ArrayList list = new ArrayList();//不标明数据类型，默认使用Object类型
        list.add("迪丽热巴");
        list.add(1);

        //使用迭代器遍历list集合
        //获取迭代器
        Iterator iterator = list.iterator();
        //使用迭代器的hasNext和next方法遍历集合
        while (iterator.hasNext()){
            //取出的元素是Object类型
            Object obj =iterator.next();
            //如果想使用String类型特有方法，length获取字符串长度， 多态 Object obj = “abc”,父类Object无法使用子类String特有的方法
            //需要向下转型

            String s = (String)obj;
            System.out.print(obj+"  ");//打印字符串
            System.out.println(s.length());//打印字符串长度
        }//迪丽热巴  4  然后会出现ClassCastException类型转换异常，不能把Integer类型转换为String类型
    }

    public static void method2(){
        /*
        创建集合对象,使用泛型
        好处:
            1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
            2.把运行期异常(代码运行之后会抛出的异常),提升到了编译期(写代码的时候会报错)
         弊端:
            泛型是什么类型,只能存储什么类型的数据
     */
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("盖伦");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s+"-->"+s.length());
        }


    }
}
