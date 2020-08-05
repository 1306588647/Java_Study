import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();//开机

//       准备一个鼠标，供电脑使用
//       Mouse mouse = new Mouse();
//       首先进行向上转型
//       USB usb = mouse;
        //或者这样写
        USB usbMouse = new Mouse();//多态写法
        //参数是USB类型，我正好传入的是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法，发生了向上转型
        //使用子类对象，匿名对象，也可以
        computer.useDevice(new Keyboard());//也是正确写法

        computer.powerOff();//关机


        //自动类型转换
        method(10.0);//10.0     正确写法，double --> double
        method(20);//20.0       正确写法，int --> double
        int a=30;
        method(a);//                 正确写法，int --> double
    }

    public static void method(double num){
        System.out.println(num);
    }
}
