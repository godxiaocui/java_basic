package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise01 {
    //键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum <= 200) {
            System.out.println("请输入一个1~10之间的整数：");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);//先把异常数据先进行过滤
            if (num >= 1 && num <= 10) {
                integers.add(num);
                sum += num;
            } else {
                System.out.println("输入有误，请重新输入！");
            }
        }

    }
}
