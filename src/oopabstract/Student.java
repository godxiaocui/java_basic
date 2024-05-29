package oopabstract;

public class Student extends Person{
    public Student(String string) {
    }

    @Override
    public void work() {
        System.out.println("is studying");
    }

    public Student() {
    }

    public Student(String name, String id) {
        super(name, id);
    }
}
