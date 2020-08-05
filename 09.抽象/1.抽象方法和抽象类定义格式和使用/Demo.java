public class Demo {

    public static void main(String[] args) {
        //Animal animal = new Animal();错误写法，抽象类不能实例化对象
        Cat cat = new Cat();
        cat.eat();
        cat.normalMethod();

    }
}
