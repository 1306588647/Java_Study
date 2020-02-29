/*
请使用Arrays相关的API，讲一个随机字符串中所有的字符串升序排列，并倒序打印
*/

import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        String str= "dajhkdjakl2546KJDAO";

        //如何进行生序排列：sort
        //必须是一个数组，才能用Arrays.sort()方法
        //String --> ，用toCharArray

        char[] array = str.toCharArray();//转换成字符数组
        Arrays.sort(array);         //对数组进行升序排列
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        //l k k j j h d d a a O K J D A 6 5 4 2

    }
}
