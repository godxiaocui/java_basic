package ArraysTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayListDEMO {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        //foreach
        strings.forEach(new Consumer<String>() {
            @Override
            // foreach的原理
            // 这里的形参是一个集合中的一个元素
            // 变调用accept方法
            public void accept(String string) {
                System.out.println(string);
            }
        });

        Iterator<String> iterator = strings.iterator();

        //lambda表达式
        strings.forEach( string -> System.out.println(string));
    }
}
