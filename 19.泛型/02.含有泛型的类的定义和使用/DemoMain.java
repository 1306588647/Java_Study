public class DemoMain {
    public static void main(String[] args) {
        //创建一个GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setName(123);
        Integer integer = gc1.getName();//也可以直接用int接收，相当于自动拆箱
        System.out.println(integer);//123

        //创建一个GenericClass对象，泛型使用String类型
        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setName("迪丽热巴");
        String name = gc2.getName();
        System.out.println(name);//迪丽热巴
    }
}
