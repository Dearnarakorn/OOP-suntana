package Lab4_2.packA;

public abstract class Employee {
    protected String name;
    protected int experience;
    protected int salary;    

    public Employee(String name, int experience, int salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }



    public abstract void sayHi();

}
