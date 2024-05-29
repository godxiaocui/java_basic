package GenericTesat;

import java.util.List;

public class GenericMethod {

    private GenericMethod(){}

    // 定义泛型方法,可变参数
    public static <E> void addALL(List<E> list, E... arr) {
        for (E e : arr) {
            list.add(e);
        }
    }
}
