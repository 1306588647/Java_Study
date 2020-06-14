/*
方法重载：多个方法的名称一样，只是参数列表不用。

方法重载与下列因素有关：
1.参数个数不同
2.参数类型不同
3.多类型的顺序不同
*/


public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(addSum(1, 1));
        System.out.println(addSum(1, 1, 1));
        System.out.println(addSum(1.2F, 1.8F));
        System.out.println(addSum(1, 1.6F));
    }

    public static int addSum(int a, int b) {
        return a + b;
    }

    public static int addSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int addSum(float a, float b) {
        return (int) (a + b);
    }

    public static int addSum(int a, float b) {
        return (int) (a + b);
    }




/*
方法重载与下列因素无关：
1.与参数名称无关
错误写法：
    public static int addSum(int a, int b) {
        return a + b;
    }

    public static int addSum(int x, int y) {
        return x + y;
    }
这两个是一个

2.与方法的返回值类型无关
错误写法：
public static int addSum(int a, int b) {
        return a + b;
    }

    public static float addSum(int x, int y) {
        return x + y;
    }


*/
}
