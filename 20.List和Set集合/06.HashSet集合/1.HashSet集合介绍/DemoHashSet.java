/*
    java.util.Set接口 extends Collection接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
         3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
         4.底层是一个哈希表结构(查询的速度非常的快)
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        //使用add方法添加数据
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //使用迭代器遍历集合
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);//结果只输出了1,2,3，最后那个1没有输出，说明最后那个1没有添加进去
        }
        //使用增强for循环
        for (Integer integer : set) {
            System.out.println(integer);//结果只输出了1,2,3，最后那个1没有输出，说明最后那个1没有添加进去

        }


    }





}
