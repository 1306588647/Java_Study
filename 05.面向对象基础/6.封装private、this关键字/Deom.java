
/*
面向对象三大特征：封装、继承、多态

封装性在java中的体现
1.方法就是一种封装
2.关键字private也是一种封装
*/
public class Deom {
    public static void main(String[] args) {
        
        int[] array = {1,8,6,2,75,62,13};
        System.out.println("Max:"+getMax(array));


        Person person = new Person();
        person.setName("海绵宝宝");
        person.setAge(1000);
        person.setAge(18);
        person.setBoy(true);
        System.out.println("姓名："+person.getName());
        System.out.println("年龄："+person.getAge());
        System.out.println("是不是男生："+person.isBoy());

        
    }

    
    //方法就是一种封装
    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
}
