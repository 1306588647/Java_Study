
/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
 */

public class StringConvert {
    public static void main(String[] args) {
        //转换成字符数组
        char[] strArray  = "Hello".toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        //转换成字节数组
        byte[] byteArray = "abc".getBytes();
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }

        String str = "What are you doing?";
        String replace = str.replace("doing", "fucking");
        System.out.println(replace);


    }
}
