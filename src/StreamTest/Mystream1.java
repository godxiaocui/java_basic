package StreamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Mystream1 {
    public static void main(String[] args) {
        //集合的批量添加
        ArrayList<String> list1 = new ArrayList<>();
        //list.add()

        list1.add("林青霞-15");
        list1.add("张曼玉-14");
        list1.add("王祖贤-223");
        list1.add("柳岩-11");
        list1.add("张敏-3");
        list1.add("张无忌-333");
        list1.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));

        //map方法
        //第一个类型原本的类型，第二个类型是转换后的类型

        list1.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String string) {
                String s = string.split("-")[1];
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));
        //简化
        list1.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));

        //toArray
        // IntFunction接口的泛型是，具体数组的类型
        // apply方法的参数是，数组的长度
        // 返回值是，数组
        // 方法体数组

        //toArray方法的作用是创建一个数组
        //toArray的底层会依次得到list1集合中的每一个元素，然后把每一个元素传递给IntFunction接口的apply方法
        //apply方法的返回值是什么，就是要转换成的数组的元素
        String[] array = list1.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        //简化
        String[] array1 = list1.stream().toArray(value -> new String[value]);

        //收集方法
        //collect方法的参数是一个函数式接口，这个函数式接口的泛型是一个集合
        //这个函数式接口的返回值是一个集合
        //collect方法的作用是把流中的元素收集到集合中
        ArrayList<String> list3 = new ArrayList<>();
        //list.add()

        list3.add("林青霞-15");
        list3.add("张曼玉-14");
        list3.add("王祖贤-223");
        list3.add("柳岩-11");
        list3.add("张敏-3");
        list3.add("张无忌-333");
        list3.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
        List<String> zhang = list3.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() >= 3).collect(Collectors.toList());
        System.out.println("zhang"+zhang.toString());

        //toMap
        Map<String, String> zhangMap = list3.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() >= 3).collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String string) {
                        return string.split("-")[0];
                    }
                }, new Function<String, String>() {
                    @Override
                    public String apply(String string) {
                        return string.split("-")[1];
                    }
                }));
        System.out.println("zhangMap"+zhangMap.toString());


        //遍历list1把以张开头的元素添加到list2中。
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }
        //遍历list2集合，把其中长度为3的元素，再添加到list3中。
        ArrayList<String> list4 = new ArrayList<>();
        for (String s : list2) {
            if(s.length() == 3){
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }
    }
}
