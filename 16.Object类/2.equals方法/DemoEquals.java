
/*
Person类默认继承了Object类,所以可以使用Object类的equals方法
boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”
equals方法源码:
    public boolean equals(Object obj) {
        return (this == obj);
    }
    参数:
        Object obj:可以传递任意的对象
        == 比较运算符,返回的是一个布尔值 true false
        基本数据类型:比较的是值
        引用数据类型:比价的是两个对象的地址值
        this是谁?那个对象调用的方法,方法中的this就是那个对象;one调用的equals方法所以this就是one
        obj是谁?传递过来的参数two
        this==obj -->one==two
*/


public class DemoEquals {

    public static void main(String[] args) {

        Person one = new Person("海绵宝宝",12);
        Person two = new Person("派大星星",13);
        System.out.println("one:"+one);//one:Person@4411d970
        System.out.println("two:"+two);//two:Person@6442b0a6
        boolean isTrue = one.equals(two);
        System.out.println(isTrue);//false

        one = two;
        System.out.println(one.equals(two));//true


    }
}
