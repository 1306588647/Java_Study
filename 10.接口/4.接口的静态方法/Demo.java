

/*

注意：不能通过接口实现类的对象来调用接口当中的静态方法。

正确调用：通过接口名称，直接调用其中的静态方法。
格式：接口名称.静态方法名（参数）；
*/
public class Demo {
    public static void main(String[] args) {


        //错误写法，因为静态方法和类没有关系，没必要创建对象
        //创建实现类对象
        MyInterfaceStaticImplemet impl = new MyInterfaceStaticImplemet();

        //错误写法
        //impl.methodStatic();

        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
