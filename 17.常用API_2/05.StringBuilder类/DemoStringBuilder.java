
/*
    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 */

/*
    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */

/*
    StringBuilder和String可以相互转换:
        String->StringBuilder:可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder->String:可以使用StringBuilder中的toString方法
            public String toString()：将当前StringBuilder对象转换为String对象。
 */

public class DemoStringBuilder {

    public static void main(String[] args) {
        //无参数构造方法
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("stringBuilder:"+stringBuilder);//stringBuilder:
        //有参构造方法
        StringBuilder builder = new StringBuilder("abc");
        System.out.println("builder:"+builder);//builder:abc


        //1.append方法
        //创建StringBuilder对象
        StringBuilder sb1 = new StringBuilder();
        //使用append方法向对象中添加数据
        //append方法返回的是this，调用方法的对象为sb1，this=sb1
        StringBuilder sb2 = sb1.append("123");//就是把sb1的地址复制给了sb2
        System.out.println(sb1);//123
        System.out.println(sb2);//123
        System.out.println(sb1==sb2);//比较的地址值true

        //因此append方法不需要接受返回值就可以了
        StringBuilder aaa= new StringBuilder();
        aaa.append(123);
        aaa.append(true);
        aaa.append(3.14);
        aaa.append("你是猪");
        System.out.println(aaa);//123true3.14你是猪

        //链式编程：返回值是一个对象，可以继续调用方法
        StringBuilder bbb= new StringBuilder();
        bbb.append(123).append(true).append(3.14).append("你是猪");
        System.out.println(bbb);//123true3.14你是猪



        //2.toString方法
        //Stirng --> StringBuilder
        String a="hello ";
        StringBuilder ccc = new StringBuilder(a);
        ccc.append("world!");
        System.out.println(ccc);//hello world!

        // StringBuilder --> Stirng
        String s = ccc.toString();
        System.out.println(s);//hello world!





    }
}
