
/*

*/
public class Deom {
    public static void main(String[] args) {
        
        Student stu = new Student();
        Student stu2 = new Student(10,"HMBB");
        System.out.println(stu2.getAge());
        stu2.setAge(19);//更改年龄
        System.out.println(stu2.getAge());

        
    }

}
