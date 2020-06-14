

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例

*/

public class DemoInstanceof {

    public static void main(String[] args) {
        Animal animal = new Cat();//本来是一只猫
        animal.eat();//猫吃鱼

        //如果希望调用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        //判断一下animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());


    }
    //有时候传入的参数不知道原类型是什么，因此要进行判断
    public static void giveMeAPet(Animal animal) {
        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
    }
}
