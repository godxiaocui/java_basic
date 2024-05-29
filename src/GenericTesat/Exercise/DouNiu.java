package GenericTesat.Exercise;

public class DouNiu extends Dog{
    public DouNiu(String name, int i) {
        super();
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁"+"斗牛犬"+getName()+"吃骨头");
    }
}
