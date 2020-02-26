
/*

*/
public class Deom {
    public static void main(String[] args) {
        
        Student stu = new Student();
        stu.setName("海绵宝宝");
        stu.setAge(18);
        System.out.println(stu.getName()+stu.getAge());

        Student stu2= new Student("派大星",19);
        System.out.println(stu2.getName()+stu2.getAge());
        stu2.setAge(20);
        System.out.println(stu2.getName()+stu2.getAge());


        
    }

}
