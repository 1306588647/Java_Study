public abstract class MyInterfaceAbstract implements MyInterfaceB,MyInterfaceA{


    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写");
    }
}

