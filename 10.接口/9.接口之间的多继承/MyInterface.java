
/*
问题：这个子接口中有几个方法呢？
答：4个

methodA来源于接口A
methodB来源于接口B
methodCommon同时来源于接口AB
method来源于我自己
*/

public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();


    @Override
    public default void methodDefault() {
        System.out.println("覆盖重写了父接口中重复的默认方法");
    }
}
