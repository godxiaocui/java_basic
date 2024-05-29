package GenericTesat.Exercise;

public class LihuaCat extends Cat{
    public LihuaCat(String name, int i) {
        super();
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁"+"梨花猫"+getName()+"吃鱼");
    }
}
