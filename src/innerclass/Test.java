package innerclass;

public class Test {
    /**
     * 这是一个匿名内部类
     * new 类名或者接口名（）{
     *     重写方法；
     * }
     *
     */
    public static void main(String[] args) {
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("匿名内部类");
            }
        };
        s.swim();
    }
}
