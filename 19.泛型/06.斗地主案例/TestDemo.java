import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    斗地主综合案例:
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class TestDemo {
    public static void main(String[] args) {
        //1.准备牌，定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，一个数组存储的是花色，一个数组存储的序号
        String[] colors = {"♠","♣","♦","♥"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //先把大小王存储到扑克中
        poker.add("大王");
        poker.add("小王");

        //循环嵌套遍历两个数组，组装剩下的52张牌
        for (String color:colors) {
            for (String number:numbers){
                //把组装好的牌存储到poker中
                poker.add(color+number);
            }
        }



        //2.洗牌
        //使用集合的工具类Collections中的方法
        //static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
        Collections.shuffle(poker);



        //3.发牌
        //定义4个集合,存储玩家的牌和底牌
        ArrayList<String> play0 = new ArrayList<>();
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        //遍历poker集合,获取每一张牌
        //使用poker集合的索引%3给3个玩家轮流发牌
        //剩余3张牌给底牌
        //注意:
        //    先判断底牌(i>=51),否则牌就发没了

        for (int i = 0; i <poker.size() ; i++) {
            //获取每一张牌
            String pai = poker.get(i);
            //轮流发牌
            if(i>=51){//如果i>=51牌发给底牌
                diPai.add(pai);
            }
            else if(i%3==0){//给玩家1发牌
                play0.add(pai);
            }
            else if(i%3==1){//给玩家2发牌
                play1.add(pai);
            }
            else if(i%3==2){//给玩家3发牌
                play2.add(pai);
            }
        }


        //看牌
        System.out.println("玩家0的牌："+play0);
        System.out.println("玩家1的牌："+play1);
        System.out.println("玩家2的牌："+play2);
        System.out.println("底牌："+diPai);


    }
}
