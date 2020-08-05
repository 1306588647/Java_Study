public class Demo {

    public static void main(String[] args) {
        int num1 =10;
        System.out.println(num1);//10
        num1 =20;
        System.out.println(num1);//20

        //一旦使用final用来修饰局部变量，那么这个变量就不能更改
        //一次赋值，终生不变
        final int num2 =100;
        System.out.println(num2);

//        num2=200;//错误写法
//        num2=100;//错误写法

        //正确写法！只要保证有唯一一次赋值
        final int num3;
        num3=30;

        //对于基本类型来说，不可变说的就是变量当中的数据不可变
        //对于引用类型来说，不可变说的就是变量当中的地址值不可变

        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1.getName());//赵丽颖
        System.out.println(stu1);
        stu1 = new Student("霍建华");
        System.out.println(stu1.getName());//霍建华
        System.out.println(stu1);

        final Student stu2 = new Student("海宝宝");
        //错误写法，final修饰引用类型变量，其中的地址值不可改变
        //stu2 = new Student("派大星");
        System.out.println(stu2.getName());//海宝宝
        //虽然引用类型中的地址不能改变，但是地址指向的内容可以改变
        stu2.setName("海宝宝宝宝宝");
        System.out.println(stu2.getName());//海宝宝宝宝宝




    }
}
