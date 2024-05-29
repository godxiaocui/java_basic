package StreamTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test01 {
    public static void main(String[] args) {
        //定一个一个1-10的数组
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        //将数组转换为集合
        List<Integer> list = Arrays.asList(arr);
        //保留偶数
        List<Integer> collect = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(collect.toString());

    }
}
