
/*
接口就是多个类的公共规范
接口是一种引用类型，最重要的内容就是其中的：抽象方法

如何定义一个接口的格式：
    public interface 接口名称{
        //接口内容
    }

备注：换成关键字interface之后，编译生成的字节码文件仍是 .java--> .class

如果是java7，那么接口中可以包含内容有：
1.常量
2.抽象方法
如果是java8，还有额外包括：
3.默认方法
4.静态方法
如果是java9还额外包括：
5.私有方法
*/
public interface MyInterface {
}
