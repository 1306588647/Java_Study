

/*
如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量

*/

public class Outer {

    int num =10;//外部类成员变量

    public class Inner{

        int num =20;//内部类成员变量

        public void methodInner(){
            int num = 30;//内部类方法的成员变量
            System.out.println(num);//30，局部变量，就近原则
            System.out.println(this.num);//20，内部类成员变量num
            System.out.println(Outer.this.num);//10外部类成员变量num
        }
    }
}
