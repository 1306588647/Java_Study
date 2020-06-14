

/*

Random用来生成随机数字
*/

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {
        Random rand = new Random();

        //不带参数，表示int中所有的数字都有可能
        int a  =rand.nextInt();
        System.out.println(a);

        int b = rand.nextInt(10);
        //代表数字在[0,10)范围内，包括0但是不包括10
        System.out.println(b);


        //练习输入两个数字，生成两个数字之间的数字，包括这两个数字
        Scanner scanf = new Scanner(System.in);
        int min=scanf.nextInt();
        int max = scanf.nextInt();
        for (int i = 0; i <10 ; i++) {
            System.out.println(rand.nextInt(max-min+1)+min);
        }



    }
}
