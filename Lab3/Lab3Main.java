package Lab3;
import java.util.ArrayList;

import Lab3.packA.*;

public class Lab3Main {
    public static void main(String[] args) {
        q1();
    }

    static void q1(){
        ArrayList<Lab3EmpTmp> aList = new ArrayList<>();
        aList.add(new Accountant("goodAtmyJob", 7, 6, 390, "sing"));
        aList.add(new Accountant("canRap", 4, 9, 480, "rap"));
        aList.add(new Salesperson("mr.salesperson", 5,150,5000));
        aList.add(new Salesperson("mr.kayan", 3, 150, 5000));
        aList.add(new Programmer("Keng",2,300));
        aList.add(new Lab3EmpTmp("invisible", 9, 120));


        System.out.println("Upcasting");
        for(Lab3EmpTmp e : aList)
            e.sayHi();


        System.out.println("Downcasting");
        for(Lab3EmpTmp e : aList){
            String str;
            if(e instanceof Programmer){
                Programmer p = (Programmer)e;
                str=p.coding();
            }  else if(e instanceof Salesperson){
                Salesperson s = (Salesperson)e;
                str = s.makeQuotation();
            } else if(e instanceof Accountant){
                Accountant a = (Accountant)e;
                str = a.tellProfit();
            } else continue;

            System.out.println(str);
        }
    }


}
