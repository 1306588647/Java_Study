

/*题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他
*/

import java.util.Scanner;

public class StringExerciseTwo {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        String str = scanf.next();

        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i]>='0'&&array[i]<='9'){
                countNumber++;
            }
            else if(array[i]>='a'&&array[i]<='z'){
                countLower++;
            }
            else if(array[i]>='A'&&array[i]<='Z'){
                countUpper++;
            }
            else{
                countOther++;
            }

        }
        System.out.println("大写字母："+countUpper);
        System.out.println("小写字母："+countLower);
        System.out.println("数字："+countNumber);
        System.out.println("其他字符："+countOther);

    }
}
