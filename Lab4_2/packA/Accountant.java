package Lab4_2.packA;

public class Accountant extends Employee {
    private static String companyName = "berk barn jamkad";
    private int experience; 
    private String specialty;

    public Accountant(String name, int Superexperience,int experience, int salary, String talent) {
        super(name, Superexperience, salary);
        this.experience = experience;
        specialty = talent;
    }

    @Override
    public void sayHi() {
        System.out.println("hi form Accountant");
        
    }

    public String tellProfit(){
        return String.format("berk barn jamkad's profit is %d. My salary is %d",(int)(Math.random()*10000),super.salary);
    }

    public static String tellMyRole(){
        return String.format("I am an accountant at %s ", companyName);
    }

    @Override
    public String toString() {
        return "Accountant [experience=" + experience + ", specialty=" + specialty + "]";
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Accountant.companyName = companyName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    

    



    

}
