

//定义一个新手机，使用老手机作为父类

public class NewPhone extends Phone{

    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
