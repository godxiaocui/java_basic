package StreamTest;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test02 {
    public static void main(String[] args) {
        //男演员信息list
        //只用引用方法，收集到student数组中
        //集合的批量添加
        ArrayList<String> list1 = new ArrayList<>();
        //list.add()

        list1.add("林青霞-15");
        list1.add("张曼玉-14");
        list1.add("王祖贤-223");
        list1.add("柳岩-11");
        list1.add("张敏-3");
        list1.add("张无忌-333");
        List<Student> collect = list1.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect.toString());

    }
    public static class Student{
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student(String str) {
            this.name = str.split("-")[0];
            this.age = Integer.parseInt(str.split("-")[1]);
        }

        public Student() {
        }

        @Override
        public String toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
