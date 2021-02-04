
/*
    java.lang.Throwable:类是 Java 语言中所有错误或异常的超类。
        Exception:编译期异常,进行编译(写代码)java程序出现的问题
            RuntimeException:运行期异常,java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病(感冒,发烧),把异常处理掉,程序可以继续执行(吃点药,继续革命工作)
        Error:错误
            错误就相当于程序得了一个无法治愈的毛病(非典,艾滋).必须修改源代码,程序才能继续执行
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args){

        //Exception:编译期异常,进行编译(写代码)java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
        Date date = null;//把字符串格式的日期,解析为Date格式的日期
        try {
            date = sdf.parse("1999-0909");
        } catch (ParseException e) {
            e.printStackTrace();
            //java.text.ParseException: Unparseable date: "1999-0909"
        }
        System.out.println(date);//null
        System.out.println("后续代码");//后续代码






        //RuntimeException:运行期异常,java程序运行过程中出现的问题
        int[] arr = {1,2,3};
        System.out.println(arr[2]);

        try {
            //可能会出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            //异常的处理逻辑
            System.out.println(e);
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }
        System.out.println("后续代码");//后续代码






        /*
            Error:错误
            OutOfMemoryError: Java heap space
            内存溢出的错误,创建的数组太大了,超出了给JVM分配的内存
         */
        //int[] arra = new int[1024*1024*1024];
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //必须修改代码,创建的数组小一点
        int[] arra = new int[1024*1024];
        System.out.println("后续代码");

    }


}
