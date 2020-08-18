import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

     Comparator和Comparable的区别
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    Comparator的排序规则:
        o1-o2:升序，反之则降序
 */
public class DemoSort02 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,3,5,3,1,0);
        System.out.println(list01);//[1, 3, 5, 3, 1, 0]
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1-o2;//升序
            }
        });
        System.out.println(list01);//[0, 1, 1, 3, 3, 5]


        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("海绵宝宝",12));
        list03.add(new Person("派大星星",8));
        list03.add(new Person("章鱼哥哥",15));
        Collections.sort(list03, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge()-o2.getAge();//年龄升序
                if(result==0){//如果年龄相同，则按照名字第一个字的前后顺序升序排列
                    result =  o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list03);//[Person{name='派大星星', age=8}, Person{name='海绵宝宝', age=12}, Person{name='章鱼哥哥', age=15}]
    }
}
