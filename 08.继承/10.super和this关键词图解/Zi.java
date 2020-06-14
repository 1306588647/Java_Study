public class Zi extends Fu {
    int n=20;

    @Override
    public void method() {
        super.method();     //调用了父类方法
        System.out.println("子类方法");
    }

    public void show(){
        int n=30;
        System.out.println(n);              //30
        System.out.println(this.n);         //20
        System.out.println(super.n);        //10
    }
}
