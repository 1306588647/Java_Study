import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class DemoLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("古力娜扎");
        set.add("迪丽热巴");
        set.add("马尔扎哈");
        set.add("马尔扎哈");
        System.out.println(set);//[迪丽热巴, 古力娜扎, 马尔扎哈],无序，不重复


        LinkedHashSet<String> linkset = new LinkedHashSet<>();
        linkset.add("古力娜扎");
        linkset.add("迪丽热巴");
        linkset.add("马尔扎哈");
        linkset.add("马尔扎哈");
        System.out.println(linkset);//[古力娜扎, 迪丽热巴, 马尔扎哈]有序，不重复

    }
}
