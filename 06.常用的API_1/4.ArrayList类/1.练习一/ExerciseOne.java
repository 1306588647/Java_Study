import java.util.ArrayList;
import java.util.Random;

/*
题目：生成6个1-33之间的随机数，添加到集合，并遍历集合
 */
public class ExerciseOne {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            int num = rand.nextInt(33)+1;
            list.add(num);
        }
        System.out.println(list);
        //或者
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
