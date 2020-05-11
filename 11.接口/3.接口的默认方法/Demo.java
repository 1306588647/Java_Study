

public class Demo {

    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbstrast();//调用抽象方法，实际运行的是MyInterfaceDefaultA类中覆盖重写的方法

        //调用默认方法，如果实现类中没有，会向上找接口
        a.methodDefault();//

        System.out.println("======================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbstrast();
        b.methodDefault();

    }
}
