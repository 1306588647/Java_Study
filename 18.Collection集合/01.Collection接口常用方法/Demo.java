import java.util.ArrayList;
import java.util.Collection;

/*
    java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法


    共性的方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class Demo {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[]  重写了toString方法

        /*
            public boolean add(E e)：  把给定的对象添加到当前集合中 。
            返回值是一个boolean值,一般都返回true,所以可以不用接收
         */
        coll.add("古力娜扎");
        coll.add("迪丽热巴");
        coll.add("马尔扎哈");
        System.out.println(coll);//[古力娜扎, 迪丽热巴, 马尔扎哈]

        /*
            public boolean remove(E e): 把给定的对象在当前集合中删除。
            返回值是一个boolean值,集合中存在元素,删除元素,返回true
                                集合中不存在元素,删除失败,返回false
         */
        boolean isTure = coll.remove("迪丽热巴");
        System.out.println(isTure);//true
        System.out.println(coll);//[古力娜扎, 马尔扎哈]
        boolean is = coll.remove("德玛西亚");
        System.out.println(is);//false
        System.out.println(coll);//[古力娜扎, 马尔扎哈]


        /*
            public boolean contains(E e): 判断当前集合中是否包含给定的对象。
            包含返回true
            不包含返回false
         */
        boolean is1 = coll.contains("古力娜扎");
        boolean is2 = coll.contains("大马西亚");
        System.out.println(is1);//true
        System.out.println(is2);//false


        //public boolean isEmpty(): 判断当前集合是否为空。 集合为空返回true,集合不为空返回false
        boolean is3 = coll.isEmpty();
        System.out.println(is3);//false


        //public int size(): 返回集合中元素的个数。
        int number = coll.size();
        System.out.println(number);//2


        //public Object[] toArray(): 把集合中的元素，存储到数组中。
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //public void clear() :清空集合中所有的元素。但是不删除集合,集合还存在
        coll.clear();
        System.out.println(coll);//[]
        System.out.println(coll.isEmpty());//true

    }
}
