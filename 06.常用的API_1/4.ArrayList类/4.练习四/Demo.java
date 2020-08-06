/*
题目：用Random类随机生成1-100之内20个数字，写一个方法传入集合，然后返回只有偶数的集合
*/

import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100)+1);
        }
        System.out.println(shaiXuan(list));


    }

    public static ArrayList<Integer> shaiXuan(ArrayList<Integer> list){
        ArrayList<Integer> minlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                minlist.add(list.get(i));
            }
        }
        return minlist;
    }
}
