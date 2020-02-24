
/*
问题描述：定义Person的年龄时候，无法阻止不合理的数值被设置进来。
解决方案：用private关键字将需要保护的成员变量进行修饰。

一旦使用了private修饰符，那么本类当中仍然可以随意访问
但是超出了本类之外的就不能再访问了

间接访问private成员变量，就是定义一对二Getter/Setter方法
对于布尔类型boolean值，Getter方法要写成isXxx形式，Setter方法不变

this关键字表示本类的成员变量
通过谁调用的方法，谁就是this
*/


public class Person {
    private String name;
    private int age;
    private boolean boy;


    //set方法用于设置成员变量
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age>=0&&age<=100) {
            this.age = age;
        }
        else {
            System.out.println("年龄不合理");
        }
    }

    public void setBoy(boolean boy){
        this.boy = boy;
    }

    //get方法用于获取成员变量
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //布尔变量获取要用is

    public boolean isBoy(){
        return this.boy;
    }
}
