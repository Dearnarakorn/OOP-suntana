package Lab2.packA;



public class Salesperson extends Programmer {
    private int target;

    public Salesperson(String name, int experience, int salary, int assignedTarget) {
        super(name, experience, salary);
        target = assignedTarget;
    }

    public Salesperson(String name, int experience) {
        super(name, experience);
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    @Override
    public void setSalary(int newsalary) {
        super.salary += newsalary;
    }

    public String makeQuotation(){
           return String.format("Dear value customer, %d is my best offer.",(int)(Math.random()*10000)); 
    }
    
    public void setSalary(){
        super.salary *= 110;
        super.salary /= 100;
    }

    @Override
    public String toString() {
        return "Salesperson [target=" + target +" "+  super.toString()+"]";
    }

    



    
}
