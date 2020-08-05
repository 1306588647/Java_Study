
/*

注意事项：
1.抽象类不能创建对象，如果创建，则编译器无法通过而报错。只能创建其非抽象子类的对象
2.抽象类中，可以有构造方法，是提供子类创建对象时，初始化父类成员使用的。
    理解：子类的构造方法中，有默认的super()，需要访问父类构造方法
3.抽象类中，不一定包含抽象方法，但是含有抽象方法的类一定是抽象类
4.抽象类的子类，必须重写抽象父类中所有的抽象方法，否则编译器无法通过而报错，除非该子类也是抽象类
*/

public class Demo {

    public static void main(String[] args) {

        //Animal animal = new Animal();错误写法，抽象类无法实例化对象
        //Dog dog = new Dog();错误写法，抽象类无法实例化对象
        DogGolde jinmao = new DogGolde();
        Doghasak erha = new Doghasak();
        jinmao.sleep();
        jinmao.eat();;
        System.out.println("=====================");
        erha.sleep();
        erha.eat();
    }
}
