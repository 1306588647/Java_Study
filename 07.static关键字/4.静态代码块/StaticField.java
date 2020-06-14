import java.time.Period;

/*
静态代码块格式：

public class 类名称{
    static {
        静态代码块内容；
    }
}

特点：当第一次用到本类时，静态代码块执行唯一的一次

*/
public class StaticField {

    static {
        System.out.println("静态代码块执行啦！");
    }

    public StaticField(){
        System.out.println("构造方法执行啦！");
    }
}
