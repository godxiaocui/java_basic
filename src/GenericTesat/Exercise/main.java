package GenericTesat.Exercise;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //1.遍历集合，调用动物的eatfangfa
        //1.所有品种的猫但是不能有狗
        //2.所有品种的狗但是不能有猫
        //3.所有动物不能有其他动物
        PersianCat persianCat = new PersianCat("加菲猫", 2);
        LihuaCat lihuaCat = new LihuaCat("梨花猫", 3);
        DouNiu niu = new DouNiu("牛", 4);
        Teddy teddy = new Teddy("泰迪", 5);
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(persianCat);
        cats.add(lihuaCat);
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(niu);
        dogs.add(teddy);
        printCat(cats);
    }
    public static void printCat(ArrayList<? extends Cat> list){
        for (Animal animal : list) {
            animal.eat();
        }

    }

}
