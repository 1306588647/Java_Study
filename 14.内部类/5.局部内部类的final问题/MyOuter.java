
/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】

备注：从java8开始，只要局部变量事实不变，那么final关键字可以省略

原因：生命周期不一样
1.new出来的对象在堆内存当中，
2.局部变量是跟着方法走的，在栈内存当中
3.方法运行结束之后，立刻出栈，局部变量就会立刻消失
4，但是new出来的对象会在堆当中持续存在，直到垃圾回收消失
只有局部变量为常量的时候，即使局部变量被释放，new出来的对象也能够通过常量池来使用
*/

public class MyOuter {

    public void methodOuter(){
        int num =10;//所在方法的局部变量

        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
