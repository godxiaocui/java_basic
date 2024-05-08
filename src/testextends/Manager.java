package testextends;

public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, Integer id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //manage
    public void manage(){
        System.out.println("manage");
    }

    @Override
    public void work(){
        System.out.println("is managing");
    }
}
