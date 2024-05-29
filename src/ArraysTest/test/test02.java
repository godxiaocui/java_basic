package ArraysTest.test;

import java.util.*;

public class test02 {
    public static void main(String[] args) {
        //学生70%的概率随机男生，30%的概率随机女生
        String[] names = {"张三","李四","王五","赵六","孙七","周八","吴九","郑十","钱十一","马十二"};
        //将数组转为list
        List<String> list = Arrays.asList(names);
        //创建一个只包含01的list长度为10，7个1，3个0·
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            integers.add(1);
        }
        for (int i = 0; i < 3; i++) {
            integers.add(0);
        }
        //打乱数据
        Collections.shuffle(integers);
        int i = new Random().nextInt(list.size());
        System.out.println(integers.get(i));
    }
}
