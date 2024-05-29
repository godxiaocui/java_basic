package ArraysTest;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {
        //重写排序方法
        Integer[] arr={2,4,9,5,21,443,564,12,3445,45,245,111};
        // 这里需要重写array 中sort的方法

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));

        String[] arr2={"a","aaaa","aa","aaa"};
//        Arrays.sort(arr2, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
        Arrays.sort(arr2,((o1, o2) -> o1.length()-o2.length()));
        System.out.println(Arrays.toString(arr2));

    }
}
