/*
数组可以作为方法的参数。
【注意】当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值。


任何数据类型都能作为方法的参数类型，或者返回值类型；
数组作为方法的参数，传递进去的其实是数组的地址值。
数组作为方法的返回值，返回的其实也是数组的地址值。


*/
public class Deom {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5,6};
        printArray(arrayA);

        int[] result = returnArray(1,2,3);
        System.out.println("sum="+result[0]+",avg="+result[1]);

    }


    //数组作为方法参数
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //数组作为方法返回值
    public static int[] returnArray(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
        int[] array = {sum,avg};
        return array;
    }
}
