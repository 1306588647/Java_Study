/*
    哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
    在Object类有一个方法,可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值。
    hashCode方法的源码:
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */



public class DemoHashCode {
    public static void main(String[] args) {
        //Person类继承了Object类,所以可以使用Object类的hashCode方法


        Person person1 = new Person();
        int num1 = person1.hashCode();
        System.out.println(num1);//2129789493
        System.out.println(person1);//Person.Person@7ef20235

        Person person2 = new Person();
        int num2 = person2.hashCode();
        System.out.println(num2);//668386784
        System.out.println(person2);//Person.Person@27d6c5e0

        /*
            toString方法的源码:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
                所以对象的地址值就是哈希值的16进制形式
         */

    }
}
