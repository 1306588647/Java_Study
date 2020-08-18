/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
 */




import java.util.ArrayList;
import java.util.Collections;

public class DemoAddAll {
    public static void main(String[] args) {
        //- public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"迪丽热巴","古力娜扎","马尔扎哈");
        System.out.println(list);//[迪丽热巴, 古力娜扎, 马尔扎哈]




        //- public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);







    }
}
