package Lab2.packA;

public class Programmer {

    private String name;
    private int experience;
    protected int salary;
    
    public Programmer(String name, int experience, int salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public Programmer(String name) {
        this.name = name;
    }

    public Programmer() {
    }

    

    public Programmer(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Programmer [name=" + name + ", experience=" + experience + ", salary=" + salary + "]";
    }

    public void sayHi(){
        System.out.println("hi from "+name);
    }

    
    
 
 
}
