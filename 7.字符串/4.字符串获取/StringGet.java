
/*
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */

public class StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        String str1 = "海绵宝宝";
        System.out.println(str1.length());

        //连接字符串
        String str2 = "派大星";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符
        char ch = str1.charAt(1);
        System.out.println(ch);

        //查找参数字符串在本来字符串中出现的位置
        String str4 = "Hello";
        String str5 = "Every Body, Hello World!";
        System.out.println(str5.indexOf(str4));
        System.out.println(str5.indexOf(str2));

    }
}
