import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    斗地主综合案例:有序版本
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */
public class Tset {
    public static void main(String[] args) {
        //1.准备拍
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();

        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //创建两个集合存储序号和花色
        List<String> colors = List.of("♥", "♦", "♣", "♠");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //先把大王和小王存储到集合中
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;

        //循环嵌套组装52张牌

        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }


        //2.洗牌
        //使用Collections中的shuffle(List)
        Collections.shuffle(pokerIndex);

        //3.发牌
        //定义四个集合，玩家0,1,2  底牌
        ArrayList<Integer> play00 = new ArrayList<>();
        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        //遍历存储索引List集合，获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) {
                //给底牌发牌
                dipai.add(in);
            } else if (i % 3 == 0) {
                //给玩家0发牌
                play00.add(in);
            } else if (i % 3 == 1) {
                //给玩家1发牌
                play01.add(in);
            } else if (i % 3 == 2) {
                //给玩家2发牌
                play02.add(in);
            }
        }


        //4.排序
        //使用Collections中的方法sort（List）
        //默认是升序排序
        Collections.sort(play00);
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(dipai);


        //5.看牌
        //定义一个看牌的方法，提高代码复用性
        /*
            参数：
                Stirng name：玩家名称
                HashMap<Integer,String> poker:存储牌的poker集合
                ArrayList<Integer> list：存储玩家和底牌的list集合

          查表法：
                遍历玩家或者底牌集合,获取牌的索引
                使用牌的索引,去Map集合中,找到对应的牌
        */
        lookpoker("迪丽热巴", poker, play00);
        lookpoker("古力娜扎", poker, play01);
        lookpoker("马尔扎哈", poker, play02);
        lookpoker("这底牌呀", poker, dipai);


    }

    public static void lookpoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        //输出玩家名称
        System.out.print(name + ":  ");
        //遍历玩家或者底牌集合，获取牌的索引
        for (Integer integer : list) {
            //使用牌的索引，在Map集合中找到对应的牌
            String value = poker.get(integer);
            System.out.print(value + " ");
        }
        System.out.println();//打印完每一个玩家的牌后换行


    }
}










