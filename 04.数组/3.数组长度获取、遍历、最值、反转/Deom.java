/*
获取数组的长度，格式：
数组名称.length

数组一旦创建，程序运行期间，长度不可改变
*/
public class Deom {
    public static void main(String[] args) {
        //获取数组长度
        int[] array = {1,2,3,45,5,8,6,8};
        System.out.println(array.length);

        //遍历数组
        //数组名称.fori  再按Tab
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(',');
        }
        System.out.println();
        //数组反转（不能使用新数组）
        for (int min = 0,max = array.length-1;max>=min; min++,max--) {
            int temp = array[min];
            array[min]=array[max];
            array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(',');
        }


    }
}
