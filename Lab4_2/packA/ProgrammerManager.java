package Lab4_2.packA;

public class ProgrammerManager extends Programmer implements ManagerRoles{

    public ProgrammerManager(String n, int exp, int sal) {
        super(n, exp, sal);
    }

    @Override
    public void sayHi(){
        System.out.println("Coding in "+ super.getSkills());
        //System.out.println("hi form ProgrammerManager");
    }

    @Override
    public String coding(){
        return "ProgrammerManager id coding....";
    }

    public int evaluate(Programmer p){
        p.salary = (p.salary*115)/100;
        return p.salary;
    }


    @Override
    public String toString() {
        return String.format("ProgrammerManager [name=%s, experience=%d, salary=%d]",name,experience,salary);
    }

    
}
