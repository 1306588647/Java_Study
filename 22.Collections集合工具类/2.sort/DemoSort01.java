/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */

import java.util.ArrayList;
import java.util.Collections;

public class DemoSort01 {
    public static void main(String[] args) {
        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        //数字比较升序
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,3,5,3,1,0);
        System.out.println(list01);//[1, 3, 5, 3, 1, 0]
        Collections.sort(list01);
        System.out.println(list01);//[0, 1, 1, 3, 3, 5]


        //字符串比较升序
        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02,"b","c","a");
        System.out.println(list02);//[b, c, a]
        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]



        //类比较需要实现并重写Comparable接口中compareTo方法
        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("海绵宝宝",12));
        list03.add(new Person("派大星星",8));
        list03.add(new Person("章鱼哥哥",15));
        Collections.sort(list03);//如果没有重写Comparable接口的排序规则，则会报错
        System.out.println(list03);//[Person{name='派大星星', age=8}, Person{name='海绵宝宝', age=12}, Person{name='章鱼哥哥', age=15}]
    }
}
