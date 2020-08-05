
/*
接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。
从效果上看，这其实就是接口的【常量】

格式：
public static final 数据类型 常量名称 = 数据值；

注意：
1.一旦使用final关键字进行修饰，说明不可改变
2.接口中的常量，可以省略 public static final，注意：不写照样是这样
3.接口中的常量，必须赋值，不能不赋值
4.接口中常量的名称，使用完全大写的字母，用下划线进行分割。这是良好的习惯
*/

public interface MyInterfaceConst {

    //这其实就是一个常量，一旦复制，不可以修改
    public static final int NUM_OF_CLASS =10;

}
