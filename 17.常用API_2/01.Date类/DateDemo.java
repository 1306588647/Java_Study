/*
    java.util.Date:表示日期和时间的类
    类 Date 表示特定的瞬间，精确到毫秒。
    毫秒:千分之一秒 1000毫秒=1秒
    特定的瞬间:一个时间点,一刹那时间
    2088-08-08 09:55:33:333 瞬间
    2088-08-08 09:55:33:334 瞬间
    2088-08-08 09:55:33:334 瞬间
    ...
    毫秒值的作用:可以对时间和日期进行计算
    2099-01-03 到 2088-01-01 中间一共有多少天
    可以日期转换为毫秒进行计算,计算完毕,在把毫秒转换为日期

    把日期转换为毫秒:
        当前的日期:2088-01-01
        时间原点(0毫秒):1970 年 1 月 1 日 00:00:00(英国格林威治)
        就是计算当前日期到时间原点之间一共经历了多少毫秒 (3742767540068L)
    注意:
        中国属于东八区,会把时间增加8个小时
        1970 年 1 月 1 日 08:00:00

    把毫秒转换为日期:
        1 天 = 24 × 60 × 60 = 86400 秒  = 86400 x 1000 = 86400000毫秒
 */

import java.sql.SQLOutput;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到1970 年 1 月 1 日 00:00:00经历了多少毫秒1596686521591

        //1.Date类的空参数构造方法，Data()获取当前系统时间
        Date date = new Date();
        //直接打印出当前时间，说明Date类toString方法被重写了
        System.out.println(date);//Thu Aug 06 12:02:01 CST 2020

        //2.Date类带参构造方法，Date(long date)：传递毫秒值，把毫秒值转换为从1970 年 1 月 1 日 00:00:00经历的毫秒，Date日期
        Date date1 = new Date(0L);
        System.out.println(date1);//Thu Jan 01 08:00:00 CST 1970
        date1 = new Date(1596686521591L);
        System.out.println(date1);//Thu Aug 06 12:02:01 CST 2020

        //3.Date成员方法getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
        //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());


    }
}
