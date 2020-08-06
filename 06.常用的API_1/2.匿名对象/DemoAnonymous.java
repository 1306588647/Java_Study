import java.util.Scanner;

/*


注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。

使用建议：
1.如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象

*/
public class DemoAnonymous {
    public static void main(String[] args) {
        //左边你的one就是对象的名字
        Person one = new Person();
        one.name = "海绵宝宝";
        one.show();



        //匿名对象
        new Person().name="派大星";
        new Person().show();//则会显示null
        //只能使用一次


        //Scanner普通使用方式
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();


        //匿名对象使用方式
        int b = new Scanner(System.in).nextInt();


        //使用匿名对象进行传参

        methodParam(new Scanner(System.in));

        //匿名对象作为返回值
        Scanner input = methodReturn();
        int x = input.nextInt();
    }
    //使用匿名对象进行传参
    public static void methodParam(Scanner scf){
        int i = scf.nextInt();

    }
    //匿名对象作为返回值
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
