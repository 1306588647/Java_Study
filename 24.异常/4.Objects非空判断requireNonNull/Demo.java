/*
    Obects类中的静态方法
    public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
    源码:
        public static <T> T requireNonNull(T obj) {
            if (obj == null)
                throw new NullPointerException();
            return obj;
        }
 */


import java.util.Objects;

public class Demo {
    public static void main(String[] args){
        //对传递过来的参数进行合法性判断,判断是否为null

        Objects.requireNonNull(null);
        //Exception in thread "main" java.lang.NullPointerException

        Objects.requireNonNull(null,"传递的对象为空");
        //Exception in thread "main" java.lang.NullPointerException: 传递的对象为空



    }







}
