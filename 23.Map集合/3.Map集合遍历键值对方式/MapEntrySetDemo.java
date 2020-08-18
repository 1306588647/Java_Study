import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第二种方式:使用Entry对象遍历

    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class MapEntrySetDemo {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> map = new HashMap<>();
        map.put("疾风剑豪","亚索");
        map.put("放逐之刃","瑞雯");
        map.put("无极剑圣","剑圣");

        //1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, String>> set = map.entrySet();//Map是外部类，Entry是内部类

        //2.遍历Set集合,获取每一个Entry对象
        //使用迭代器遍历set集合
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            //3.使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }


        System.out.println("==========================");
        //也可以使用增强for循环
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }


    }
}
