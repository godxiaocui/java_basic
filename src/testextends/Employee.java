package testextends;

public class Employee {

    private String name;
    private Integer id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //work
    public void work(){
        System.out.println("work");
    }

    //eat
    public void eat(){
        System.out.println("eat");
    }
}
