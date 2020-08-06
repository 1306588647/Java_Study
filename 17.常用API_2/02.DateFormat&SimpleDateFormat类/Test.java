/*
    练习:
        请使用日期时间相关的API，计算出一个人已经出生了多少天。
    分析:
        1.使用Scanner类中的方法next,获取出生日期
        2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        3.把Date格式的出生日期转换为毫秒值
        4.获取当前的日期,转换为毫秒值
        5.使用当前日期的毫秒值-出生日期的毫秒值
        6.把毫秒差值转换为天(s/1000/60/60/24)
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        //1.获取出生日期
        Scanner scanf = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd:");
        String birthday = scanf.next();

        //2.转化为Date格式出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthday);

        //3.把出生日期Date格式转化为毫秒值
        long birthdayDateTime = birthdayDate.getTime();

        //4.获取当前日期转化为毫秒值
        long todayTime = new Date().getTime();

        //5.当前日期毫秒-出生日期毫秒
        long time = todayTime-birthdayDateTime;

        //6.把差值毫秒转化为天
        System.out.println(time/1000/60/60/24);



    }
}
