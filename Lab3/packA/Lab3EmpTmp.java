package Lab3.packA;

public class Lab3EmpTmp {

    protected String name;
    protected int experience;
    protected int salary;
    
    public Lab3EmpTmp(String name, int experience, int salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public Lab3EmpTmp(String name) {
        this.name = name;
    }

    public Lab3EmpTmp() {
    }

    public Lab3EmpTmp(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }


    @Override
    public String toString() {
        return "Programmer [name=" + name + ", experience=" + experience + ", salary=" + salary + "]";
    }

    public void sayHi(){
        System.out.println("(Emp) hi from "+name);
    }

    
    
 
 
}
