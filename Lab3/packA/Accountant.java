package Lab3.packA;

public class Accountant extends Lab3EmpTmp{
    private static String companyName = "berk barn jamkad";
    private int experience; 
    private String specialty;

    public Accountant(String name, int Superexperience,int experience, int salary, String talent) {
        super(name, Superexperience, salary);
        this.experience = experience;
        specialty = talent;
    }

    public void setAccountantExperience(int experience) {
        this.experience = experience;
    }

    public int getAccountantExperience() {
        return experience;
    }


    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }


    public String tellProfit(){
        return String.format("berk barn jamkad's profit is %d. My salary is %d",(int)(Math.random()*10000),super.salary);
    }

    // @Override
    // public String toString() {
    //     return "Accountant [companyName=" + companyName + ", experience=" + experience + ", specialty=" + specialty
    //             + "]";
    // }

    @Override
    public String toString() {
        return String.format("%s %d %d can %s",super.getName(),super.getExperience(),getAccountantExperience(),specialty);
    }

    @Override
    public void sayHi(){
        System.out.println("(Acc) hi from "+companyName);
    }

    public static String tellMyRole(){
        return String.format("I am an accountant at %s ", companyName);
    }

    

    
}
