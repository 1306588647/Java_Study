
/*
题目：自定义4个学生对象，添加到集合，并遍历
*/

import java.util.ArrayList;

public class ExerciseTwo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("海绵宝宝",18);
        Student two = new Student("派大星",19);
        Student three = new Student("章鱼哥",38);
        Student four = new Student("蟹老板",40);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("第"+(i+1)+"位学生信息：");
            System.out.println("姓名："+list.get(i).getName());
            System.out.println("年龄："+list.get(i).getAge());
        }
    }
}
