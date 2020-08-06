

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3，....]）
public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序


备注：
1.如果是数值，sort默认按照升序从小到大
2.如果是字符串，sort默认按照字母升序
3.如果是自定义的类型，那么这个自定义需要有Comparable或者Comparator接口的支持。
*/

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        //将int[]数组按照默认格式编程字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        //[1, 2, 3, 4, 5, 6]


        int[] array = {1,5,9,48,636,48,145,652};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //[1, 5, 9, 48, 48, 145, 636, 652]

        String[] stringArray = {"aba","aab","eee","c","ddd"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        //[aab, aba, c, ddd, eee]
    }
}
