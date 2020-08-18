
/*
    Map集合的第一种遍历方式:通过键找值的方式
    Map集合中的方法:
         Set<K> keySet() 返回此映射中包含的键的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        2.遍历set集合,获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class DemoMap {
    public static void main(String[] args) {
        //利用多态创建一个Map集合对象
        Map<String,String> map = new HashMap<>();
        map.put("放逐之刃","瑞雯");
        map.put("疾风剑豪","亚索");
        map.put("无影流主","儿童劫");

        //1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        Set<String> keys = map.keySet();

        //2.遍历set集合,获取Map集合中的每一个key
        //使用迭代器遍历Set集合
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            //3.通过Map集合中的方法get(key),通过key找到value
            String value = map.get(key);
            System.out.println(key+":"+value);

        }
        System.out.println("=========================");


        //通过增强for循环
        for (String key : keys) {
            //3.通过Map集合中的方法get(key),通过key找到value
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

    }
}
