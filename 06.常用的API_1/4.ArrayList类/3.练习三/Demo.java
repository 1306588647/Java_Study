import java.util.ArrayList;

/*
题目：定义以指定格式打印集合的方法（ArrayList类型作为参数）使用{}括起来，并用。分隔每个元素
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("海绵宝宝");
        list.add("派大星星");
        list.add("章鱼哥哥");
        //直接打印
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1){
                System.out.print(list.get(i)+"。");
            }
            else{
                System.out.print(list.get(i));
            }
        }
        System.out.print("}");

    }
}
