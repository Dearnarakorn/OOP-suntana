package Lab3.packA;



public class Salesperson extends Lab3EmpTmp {
    private int target;

    public Salesperson(String name, int experience, int salary, int assignedTarget) {
        super(name, experience, salary);
        target = assignedTarget;
    }

    public Salesperson(String name, int experience) {
        super(name, experience);
    }

    public void setTarget(int target) {
        this.target = target;
    }
    
    public int getTarget() {
        return target;
    }


    public void setSalary(){
        super.salary *= 110;
        super.salary /= 100;
    }

    @Override
    public void setSalary(int incresedAmount) {
        super.salary += incresedAmount;
    }

    public String makeQuotation(){
           return String.format("Dear value customer, %d is my best offer.",(int)(Math.random()*10000)); 
    }
    


    @Override
    public String toString() {
        return "Salesperson [target=" + target +" "+  super.toString()+"]";
    }

    



    
}
