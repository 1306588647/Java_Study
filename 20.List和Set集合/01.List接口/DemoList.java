/*
    java.util.List接口 extends Collection接口
    List接口的特点:
        1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
        2.有索引,包含了一些带索引的方法
        3.允许存储重复的元素

    List接口中带索引的方法(特有)
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    注意:
        操作索引的时候,一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常,集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        //创建一个List集合对象，可以使用多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        //打印集合
        System.out.println(list);//[迪丽热巴, 古力娜扎, 马尔扎哈]  说明重写了toString方法

        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        //在迪丽热巴和古力娜扎之间添加一个德玛西亚
        list.add(1,"德玛西亚");
        System.out.println(list);//[迪丽热巴, 德玛西亚, 古力娜扎, 马尔扎哈]


        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        //比如移除德玛西亚

        String s =list.remove(1);
        System.out.println("被移除的元素是："+s);//被移除的元素是：德玛西亚
        System.out.println(list);//[迪丽热巴, 古力娜扎, 马尔扎哈]



        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        //把马尔扎哈,替换为德玛西亚
        String s1 = list.set(2,"德玛西亚");
        System.out.println("被替换前的元素是："+s1);//被替换前的元素是：马尔扎哈
        System.out.println(list);//[迪丽热巴, 古力娜扎, 德玛西亚]


        //List集合遍历有3种方式
        //1.使用普通的for循环get方法
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("======================");


        //2.使用迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("======================");


        //3.使用增强for循环
        for (String s2 : list) {
            System.out.println(s2);
        }



        //要防止索引越界异常
        //System.out.println(list.get(5));//IndexOutOfBoundsException

    }
}
