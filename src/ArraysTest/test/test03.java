package ArraysTest.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test03 {
    public static void main(String[] args) {
        //生成一个包含10个名字的list
        String[] names = {"张三","李四","王五","赵六","孙七","周八","吴九","郑十","钱十一","马十二"};
        //将数组转为list
        List<String> list1 =new ArrayList<>(Arrays.asList(names));
        List<String> list2 = new ArrayList<>();
        //不重复随机点名
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("========第"+i+"次点名========");
            int size= list1.size();
            for (int j = 0; j < size; j++) {
                int index = random.nextInt(list1.size());
                list2.add(list1.get(index));
                list1.remove(index);
                System.out.println(list2.get(j));
            }
            list1.addAll(list2);
            list2.clear();
        }

    }
}
