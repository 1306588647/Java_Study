/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。此方法等效于add()
        - public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。此方法相当于 removeFirst

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */


import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        //创建一个LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法
        linked.add("迪丽热巴");
        linked.add("古力娜扎");
        linked.add("马尔扎哈");
        System.out.println(linked);//[迪丽热巴, 古力娜扎, 马尔扎哈]






        /*
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。此方法等效于add()
        - public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
        */

        //在集合的开头添加元素
        //public void addFirst(E e):将指定元素插入此列表的开头。
        linked.addFirst("德玛西亚");
        System.out.println(linked);//[德玛西亚, 迪丽热巴, 古力娜扎, 马尔扎哈]


        //在集合的开头添加元素
        //public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
        linked.push("诶呀诶呀");
        System.out.println(linked);//[诶呀诶呀, 德玛西亚, 迪丽热巴, 古力娜扎, 马尔扎哈]


        //在集合末尾添加元素
        //public void addLast(E e)，此方法等效于add()
        linked.addLast("哈哈哈哈");
        System.out.println(linked);//[诶呀诶呀, 德玛西亚, 迪丽热巴, 古力娜扎, 马尔扎哈, 哈哈哈哈]







        /*
        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。
        */

        //如果清空集合
        //linked.clear();//再获取集合中的元素时，会抛出异常NoSuchElementException

        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);//诶呀诶呀
            String last = linked.getLast();
            System.out.println(last);//哈哈哈哈
        }





        /*
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。此方法相当于 removeFirst
         */
        System.out.println(linked);//[诶呀诶呀, 德玛西亚, 迪丽热巴, 古力娜扎, 马尔扎哈, 哈哈哈哈]

        String s = linked.removeFirst();
        System.out.println("被移除的第一个元素："+s);//被移除的第一个元素：诶呀诶呀
        System.out.println(linked);//[德玛西亚, 迪丽热巴, 古力娜扎, 马尔扎哈, 哈哈哈哈]

        String s1 = linked.removeLast();
        System.out.println("被移除的最后一个个元素："+s1);//被移除的最后一个个元素：哈哈哈哈
        System.out.println(linked);//[德玛西亚, 迪丽热巴, 古力娜扎, 马尔扎哈]

        String pop = linked.pop();
        System.out.println("被移除的第一个个元素："+pop);//被移除的第一个元素：德玛西亚
        System.out.println(linked);//[迪丽热巴, 古力娜扎, 马尔扎哈]


    }





}
