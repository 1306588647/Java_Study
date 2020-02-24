import java.util.Arrays;

/*
面向过程：当需要实现一个功能的时候，每个一具体的步骤都要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事二
*/



/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

1.导包：也就是指出需要使用的类，在什么位置。
import 包名称.类名称;
import cn.baidu.Student;
对于和当前类同一个包的情况下，可以省略导包语句。


*/


public class Deom {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //面向过程输出数组
        System.out.print('[');
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.print(']');


        //面向对象输出数组
        System.out.println();
        System.out.println(Arrays.toString(array));




        //类创建和使用
        Student student = new Student();

        //由于未提前赋值，打印出默认值
        System.out.println(student.name);//输出null
        System.out.println(student.age);//输出0

        student.name ="海绵宝宝";
        student.age=18;

        System.out.println(student.name);
        System.out.println(student.age);

        student.eat();
        student.sleep("海绵宝宝");
        student.study();

    }
}
