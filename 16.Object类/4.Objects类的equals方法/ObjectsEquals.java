import java.util.Objects;

/*
public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
*/
public class ObjectsEquals {
    public static void main(String[] args) {
        String a=null;
        String b="123";
        String c=null;
//        System.out.println(a.equals(123));//报错NullPointerException空指针异常
        System.out.println(Objects.equals(a,b));//false
        System.out.println(Objects.equals(a,c));//true

    }
}
