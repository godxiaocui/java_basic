package GenericTesat.Exercise;

public class Teddy extends Dog{
    public Teddy(String name, int i) {
        super();
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁"+"泰迪"+getName()+"吃骨头");
    }
}
