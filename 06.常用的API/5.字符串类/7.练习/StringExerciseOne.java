
/*
题目：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。
格式参照如下：[1#2#3]。
*/


public class StringExerciseOne {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i!=array.length-1){
                str = str+array[i]+"#";
            }
            else{
                str = str+array[i];
            }
        }
        str = str+"]";
        return str;
    }
}
