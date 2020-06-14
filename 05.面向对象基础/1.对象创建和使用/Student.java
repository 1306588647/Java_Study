
/*
注意事项：
1.成员变量是直接定义在类当中的，在方法外；
2.成员方法不要写static关键字。
*/

public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(String who){
        System.out.println(who+"我要睡觉");
    }

    public void study(){
        System.out.println("学习");
    }

}
