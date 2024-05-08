package methods;

import java.util.Scanner;
import java.util.StringJoiner;

public class test01 {
    public static void main(String[] args) {
      // 给一个字符串“str is bool” 取出最后一个单词的长度
        // 思路先倒转字符串在遍历找到一个空格就结束
        String str = "str  is   bool";
        // 倒转字符串
        String reverse = new StringBuffer(str).reverse().toString();
        // 遍历找到第一个空格就结束
        int length=0;
        for (int i = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i) == ' ') {
               break;
            }
            length++;

        }
        System.out.println(length);

    }


}

