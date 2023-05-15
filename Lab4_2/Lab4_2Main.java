package Lab4_2;
import java.util.ArrayList;

import Lab4_2.packA.*;

public class Lab4_2Main {
    public static void main(String[] args) {
        q1();
        System.out.println("-------------------");
        q2();
    }

    static void q1(){
        ProgrammerManager pmanager = new ProgrammerManager("Codereviewer",9,550);
        System.out.println(pmanager);
        pmanager.setSkills("solidity","typescript");
        Employee e = pmanager;
        //((ProgrammerManager)e).setSkills("solidity","typescript");
        e.sayHi();
    }

    static void q2(){
        ProgrammerManager pmanager = new ProgrammerManager("Codereviewer",9,550);
        ArrayList<Programmer> aList = new ArrayList<>();
        aList.add(new Programmer("Keng",2,300));
        aList.add(new Programmer("Somsri",3,400));
        aList.add(new Programmer("haha",4,600));
        for(Programmer p : aList){
            int newSalary = pmanager.evaluate(p);
            System.out.println(newSalary);
        }



    }
}
