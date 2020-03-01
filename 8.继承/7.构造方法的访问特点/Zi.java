

public class Zi extends Fu {

    public Zi(){
        super(10);
        System.out.println("子类构造方法！");
    }

    public void method(){
        //super();错误写法，只有子类构造方法调用父类构造方法
    }
}
