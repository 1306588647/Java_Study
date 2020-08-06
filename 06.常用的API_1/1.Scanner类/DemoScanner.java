

/*

引用类型的基本使用步骤
1.导包
    import 包路径.类名称
    如果需要使用目标类，和当前类位于同一个包下，则可以省略导包语句不写。
    只有java.lang包下的内容不需要导包，其他的包都需要import

2.创建
    类名称 对象名 = new 类名称（）；


3.使用
    对象名.成员方法（）

    scanf.nextInt（）；
*/

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        //System.in代表从键盘进行输入
        Scanner scanf = new Scanner(System.in);
        int num = scanf.nextInt();//从键盘获取一个int型变量
        System.out.println("输入的数字是："+num);

        String string =scanf.next();//从键盘获取一个字符串
        System.out.println("输入的字符串为："+string);
    }
}
