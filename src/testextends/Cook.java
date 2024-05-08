package testextends;

public class Cook extends Employee{
    private String food;

    public Cook() {
    }

    public Cook(String name, Integer id, double salary, String food) {
        super(name, id, salary);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    //cook
    public void cook(){
        System.out.println("cook");
    }

    @Override
    public void work(){
        System.out.println("is cooking");
    }
}
