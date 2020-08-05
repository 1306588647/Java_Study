public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbstrast() {
        System.out.println("实现了抽象方法BBB！");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口默认方法！");
    }
}
