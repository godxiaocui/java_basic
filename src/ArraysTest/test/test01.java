package ArraysTest.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test01 {
    public static void main(String[] args) {
        //生成一个包含10个名字的list
        String[] names = {"张三","李四","王五","赵六","孙七","周八","吴九","郑十","钱十一","马十二"};
        //将数组转为list
        List<String> list = Arrays.asList(names);
        //随机点
        int i = new Random().nextInt(list.size());
        System.out.println(list.get(i));

    }
}
