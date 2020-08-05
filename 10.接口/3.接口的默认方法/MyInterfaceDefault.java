/*
从java8开始，允许接口里面定义默认方法。
格式：
    public default 返回值类型 方法名称(参数列表){
        方法体
    }
备注：接口当中的默认方法，可以解决接口升级的问题
注意：public显示灰色，表示可以省略不写


1.接口的默认方法，可以通过接口实现类对象，直接调用
2.接口的默认方法，也可以被接口实现类进行覆盖重写。

*/

public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbstrast();

    //假如MyInterfaceDefaultA,B已经投入使用，如果再添加一个抽象方法，则就会报错
    //public abstract void methodAbstrast2();

    //新添加的方法，改成默认方法，这样接口升级后，实现接口的类就不会报错了
    public default void methodDefault(){
        System.out.println("这是一个默认方法！");
    }

}
