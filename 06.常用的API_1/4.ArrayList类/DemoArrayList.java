/*
数组和ArrayList集合的区别：
数组的长度一旦定义就不可改变，集合却可以改变
*/


import java.util.ArrayList;

/*

对于ArrayList后面有尖括号<E>代表泛型
泛型：也就是装在集合中的所有元素，全都是统一的类型。
注意：泛型只能是引用类型，不能是基础类型。

注意事项：对于ArrayList集合来说，直接打印的不是地址值，而是内容
如果为空，得到的是空中的括号[]。
*/
public class DemoArrayList {
    public static void main(String[] args) {

        //例如创建一个字符串类型集合
        ArrayList<String> list = new ArrayList<>();//右边尖括号的内容可写可不写，但是左边必须写。
        System.out.println(list);


//常用方法：
        //1.向集合中添加元素用到add方法,返回值代表添加的动作是否成功
        //对于ArrayList添加一定成功，但是对于别的集合不一定成功
        //public boolean add(E e);大写字母代表ArrayList<E>尖括号中的泛型一致
        boolean istrue = list.add("海绵宝宝");
        list.add("派大星");
        list.add("章鱼哥");
        System.out.println("添加成功"+istrue);
        System.out.println(list);


        System.out.println("=================================");


        //2.集合中中获取元素，参数是索引编号，返回值就是索引编号对应的元素
        //public E get(int index);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        System.out.println("============================");


        //3.从集合中删除元素，参数是索引编号，返回值时被删除的元素
        //public E remove(int index)
        list.remove(0);
        System.out.println(list);


        //4.获取集合的尺寸长度，返回值为是集合中包含的元素个数
        //public int size();
        System.out.println(list.size());




    }
}
