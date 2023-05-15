package Lab4_2.packA;

import java.util.ArrayList;

public class Programmer extends Employee{
    private ArrayList<String> skills = new ArrayList<>();

    public Programmer(String n,int exp,int sal){
        super(n, exp, sal);
    }    

    @Override
    public void sayHi(){
        System.out.println("hi form Programmer");
    }

    public String coding(){
        return "Programmer is coding....";
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void setSkills(String...skill) {
        for(String s : skill){
            skills.add(s);
        }
    }

    @Override
    public String toString() {
        return "Programmer [skills=" + skills + "]";
    }

    


}
