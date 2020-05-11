

public class Demo {

    public static void main(String[] args) {

        //错误写法，不能直接new接口对象使用
        //MyInterfaceAbstract inter = new MyInterfaceAbstract();

        //创建实现类的对象使用
        MyInerfaceAbstractImpl impl = new MyInerfaceAbstractImpl();
        impl.methodAbstract1();
        impl.methodAbstract2();
        impl.methodAbstract3();
        impl.methodAbstract4();

    }
}
