/*
    测试含有泛型的方法
*/
public class MainDemo {
    public static void main(String[] args) {
        //创建对象
        GenericMethod gm = new GenericMethod();
        /*
            调用含有泛型的方法method1
            传递什么类型，泛型就是什么类型
        */
        gm.method1(123);
        gm.method1("迪丽热巴");
        gm.method1(true);

        //使用静态方法，不建议创建对象使用
        GenericMethod.method2(123);
        GenericMethod.method2("静态方法");
        GenericMethod.method2(true);

    }
}
