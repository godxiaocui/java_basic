package ArraysTest;

public class LambdaMethodDemo {
    public static void main(String[] args) {

        //  Lambda表达式
        // 1. 必须是函数式接口，抽象类也不行(有切只有一个抽象方法的接口叫做函数接口)
        method(()->{
            System.out.println("游泳");

        });


    }

    public static void  method (swim s){
        s.swimming();
    }
}
@FunctionalInterface
interface swim{
    public abstract void swimming();
}