
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，
而是属于所在的类。多个对象共享同一份数据。


*/

public class StaticField {
    public static void main(String[] args) {
        Student one = new Student("海绵宝宝",18);
        one.room = "101教室";
        Student two = new Student("派大星星",20);

        System.out.println("姓名："+one.getName()+",年龄："+one.getAge()
        +",教室："+one.room+",ID:"+one.getId());
        System.out.println("姓名："+two.getName()+",年龄："+two.getAge()
        +",教室："+two.room+",ID:"+two.getId());


//        姓名：海绵宝宝,年龄：18,教室：101教室,ID:1
//        姓名：派大星星,年龄：20,教室：101教室,ID:2
    }
}
