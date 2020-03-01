public class DemoMain {
    public static void main(String[] args) {


        //老手机功能
        Phone oldPhone = new Phone();
        oldPhone.call();
        oldPhone.send();
        oldPhone.show();

        System.out.println("================");
        //新手机功能
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
