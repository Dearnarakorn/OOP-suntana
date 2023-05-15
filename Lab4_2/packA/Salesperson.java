package Lab4_2.packA;

public class Salesperson extends Employee implements SalesRoles{

    private int target;

    public Salesperson(String name, int experience, int salary) {
        super(name, experience, salary);
    }

    public Salesperson(String name, int experience, int salary, int assignedTarget) {
        super(name, experience, salary);
        target = assignedTarget;
    }

    @Override
    public String makeQuotation() {
        return String.format("Dear value customer, %d is my best offer.",(int)(Math.random()*10000));
    }

    @Override
    public void sayHi() {
        System.out.println("hi form Salesperson");
    }

    public void setSalary(){
        salary = (salary*110)/100;

    }

    public void setSalary(int Amount){
        salary += Amount;
    }

    @Override
    public String toString() {
        return "Salesperson [target=" + target + "]";
    }

    
    
}
