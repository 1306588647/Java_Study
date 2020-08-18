import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class DemoHashMap {
    public static void main(String[] args) {
        /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            value可以重复(同名同年龄的人视为同一个)
      */

        //创建HashMap集合
        HashMap<String,Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("德玛西亚",new Person("盖伦",28));
        map.put("诺克萨斯",new Person("诺手",30));
        map.put("扭曲丛林",new Person("瑞雯",20));

        //使用keySet加强for循环遍历集合
        Set<String> set = map.keySet();
        for (String s : set) {
            Person person = map.get(s);
            System.out.println(s+" --> "+person);
            //德玛西亚 --> Person{name='盖伦', age=28}
            //诺克萨斯 --> Person{name='诺手', age=30}
            //扭曲丛林 --> Person{name='瑞雯', age=20}
        }




        /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
     */
        HashMap<Person,String> map1 = new HashMap<>();
        map1.put(new Person("古力娜扎",18),"北京");
        map1.put(new Person("迪丽热巴",19),"上海");
        map1.put(new Person("马尔扎哈",18),"郑州");

        //使用entrySet和增强for循环遍历map1集合
        Set<Map.Entry<Person, String>> entries = map1.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" --> "+value);
        }
        //Person{name='古力娜扎', age=18} --> 北京
        //Person{name='迪丽热巴', age=19} --> 上海
        //Person{name='马尔扎哈', age=18} --> 郑州


    }
}
