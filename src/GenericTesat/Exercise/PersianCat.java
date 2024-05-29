package GenericTesat.Exercise;

public class PersianCat extends Cat{
    public PersianCat(String name, int i) {
       this.setName(name);
         this.setAge(i);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁"+"波斯猫"+getName()+"吃鱼");
    }
}
