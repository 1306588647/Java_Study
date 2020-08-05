public class Zi extends Fu {

    public Zi(){
        //super();赠送父类构造方法
        System.out.println("子类调用方法");
    }

    @Override
    public void eat() {
        System.out.println("吃");
    }
}
