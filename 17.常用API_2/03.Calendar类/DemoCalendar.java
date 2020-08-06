
/*
    java.util.Calendar类:日历类
    Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
    Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 */

/*
    Calendar类的常用成员方法:
        public int get(int field)：返回给定日历字段的值。
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class DemoCalendar {
    public static void main(String[] args) {
        //使用getInstence方法获取Calendar对象
        Calendar calendar = Calendar.getInstance();//多态
        System.out.println(calendar);
/*
        1.public int get(int field)：返回给定日历字段的值。
        参数:传递指定的日历字段(YEAR,MONTH...)
        返回值:日历字段代表的具体的值
*/
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);//2020
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);//7    西方的月份0-11，东方的月份1-12
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);





/*
        2.public void set(int field, int value)：将给定的日历字段设置为给定值。
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int value:给指定字段设置的值
*/
        Calendar cal = Calendar.getInstance();
        //设置9999年
        cal.set(Calendar.YEAR,9999);
        //设置9月
        cal.set(Calendar.MONTH,9);
        //设置9日
        cal.set(Calendar.DAY_OF_MONTH,9);
        System.out.println(cal.get(Calendar.YEAR)+"年"+cal.get(Calendar.MONTH)+"月"+cal.get(Calendar.DAY_OF_MONTH)+"日");//9999年9月9日
        //同时设置年月日，可以使用set重载方法
        cal.set(8888,8,8);
        System.out.println(cal.get(Calendar.YEAR)+"年"+cal.get(Calendar.MONTH)+"月"+cal.get(Calendar.DAY_OF_MONTH)+"日");//8888年8月8日


/*
        3.public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        把指定的字段增加/减少指定的值
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int amount:增加/减少指定的值
                正数:增加
                负数:减少
*/
        cal.add(Calendar.YEAR,-1000);
        cal.add(Calendar.MONTH,-1);
        cal.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(cal.get(Calendar.YEAR)+"年"+cal.get(Calendar.MONTH)+"月"+cal.get(Calendar.DAY_OF_MONTH)+"日");//7888年7月7日




/*
        4.public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        把日历对象,转换为日期对象

*/
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);//Thu Aug 06 14:54:50 CST 2020
    }
}
