package ArraysTest.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static   ArrayList<String> pokerList = new ArrayList<>();

    static {
        // 准备花色和牌
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        // 创建牌

        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pokerList.add(card);
            }
        }
        pokerList.add("SJoker");
        pokerList.add("LJoker");

    }

    public PokerGame(){
        //准备
        //洗牌
        Collections.shuffle(pokerList);
        //发牌
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lord = new ArrayList<>();
        //遍历poker集合，获取每一张牌
        for (int i = 0; i < pokerList.size(); i++) {
            String card = pokerList.get(i);
            //轮流发牌
            if (i <= 2) {
                //给底牌发牌
                lord.add(card);
            } else {
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);
                } else {
                    player3.add(card);
                }
            }
        }
        //看牌
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
        lookPoker("底牌", lord);

    }
    public void lookPoker(String name, ArrayList<String> player){
        System.out.print(name + "的牌是：");
        for (String s : player) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
