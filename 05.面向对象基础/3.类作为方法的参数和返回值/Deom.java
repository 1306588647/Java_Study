

/*

*/

public class Deom {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.name="苹果";
        one.price=4999.99;
        one.color= "蓝色";
        method(one);


        Phone three = getPhone();
        System.out.println(three.name);
        System.out.println(three.price);
        System.out.println(three.color);
    }




    //类作为方法的参数
    //【注意】：当一个对象作为参数，传递到方法当中时，
    //          实际上传递进去的是对象的地址值。
    public static void method(Phone example){
        System.out.println(example.name);
        System.out.println(example.price);
        System.out.println(example.color);
    }


    //类作为方法的返回值
    //【注意】：当一个对象作为返回值时，实际上返回的是对象的地址值。
    public static Phone getPhone(){
        Phone two = new Phone();
        two.name="华为";
        two.price=3999.99;
        two.color= "粉色";
        return two;
    }

}
