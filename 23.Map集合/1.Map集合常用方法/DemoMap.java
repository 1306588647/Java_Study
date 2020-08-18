import java.util.HashMap;
import java.util.Map;
//Map集合常用方法

public class DemoMap {
    public static void main(String[] args) {
        //利用多态创建一个Map集合对象
        Map<String,String> map = new HashMap<>();


        /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候,key不重复,返回值V是null
                存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
        */
        String v1 = map.put("德玛西亚", "盖伦");
        System.out.println(v1);//null

        String v2 = map.put("德玛西亚", "德玛西亚之力");
        System.out.println(v2);//盖伦

        map.put("放逐之刃","瑞雯");
        map.put("托儿所","瑞雯");

        System.out.println(map);//{德玛西亚=德玛西亚之力}说明重写了toString方法





        /*
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值:V
                key存在,v返回被删除的值
                key不存在,v返回null
        */
        System.out.println(map);//{托儿所=瑞雯, 放逐之刃=瑞雯, 德玛西亚=德玛西亚之力}
        String rm1 = map.remove("刀锋之影");//如果没有这个key则返回空
        System.out.println(rm1);//null
        String rm2 = map.remove("放逐之刃");
        System.out.println(rm2);//瑞雯
        System.out.println(map);//{托儿所=瑞雯, 德玛西亚=德玛西亚之力}





        /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
        */
        System.out.println(map);//{托儿所=瑞雯, 德玛西亚=德玛西亚之力}
        String result1 = map.get("虚空恐惧");
        System.out.println("result1 = " + result1);//result1 = null
        String result2 = map.get("托儿所");
        System.out.println("result2 = " + result2);//result2 = 瑞雯





        /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false
        */
        System.out.println(map);//{托儿所=瑞雯, 德玛西亚=德玛西亚之力}
        boolean contaions1 = map.containsKey("哈哈哈");
        System.out.println(contaions1);//false
        boolean contaions2 = map.containsKey("托儿所");
        System.out.println(contaions2);//true


    }
}
