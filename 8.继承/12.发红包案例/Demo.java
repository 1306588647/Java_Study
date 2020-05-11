import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        Manager manager = new Manager("群主",100);

        Memeber one = new Memeber("成员A",0);
        Memeber two = new Memeber("成员A",0);
        Memeber three = new Memeber("成员A",0);

        //先先试一下各自拥有多钱
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============================");

        //群主发20块钱，分成三个红包
        ArrayList<Integer> redList = manager.send(20,3);
        //三个成员去收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
