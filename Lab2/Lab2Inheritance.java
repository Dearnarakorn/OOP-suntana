package Lab2;
import Lab2.packA.*;

public class Lab2Inheritance {
    public static void main(String[] args) {
        //q1();
        //q2_Salesperson();
        q3_Accountant();
    }

    static void q1(){
        Programmer p1 = new Programmer("ber",2,500);
        System.out.println(p1);

    }

    static void q2_Salesperson() {
        Salesperson p2 = new Salesperson("mr.salesperson", 5, 150, 5000);
        Salesperson p3 = new Salesperson("mr.kayan", 4, 260, 9000);
        System.out.println("example of inherited method " + p2.getName());
        System.out.println(p2.makeQuotation());
        System.out.print("another example of inherited method ");
        p3.sayHi();
        System.out.println("notice the result of overridden setSalary(int incresedAmount) below");
        System.out.print(p2.getName() + "'s salary was " + p2.getSalary() + " -> ");
        p2.setSalary(100);
        System.out.println(p2);
        p2.setSalary();
        System.out.println(p2);
        System.out.println(p3);
    }

    static void q3_Accountant() {
        Accountant p4 = new Accountant("goodAtmyJob", 7, 6, 390, "sing");
        Accountant p5 = new Accountant("canRap", 4, 9, 480, "rap");
        System.out.println(p4.tellProfit());
        //System.out.println(p5.tellProfit());
        p5.sayHi();
        System.out.println(Accountant.tellMyRole());
        System.out.println(p4);
        System.out.println(p5);
    }
    
    // static void q3_Accountant() { 
    //     Accountant p4 = new Accountant("goodAtmyJob", 7, 6, 390, "sing"); 
    //     Accountant p5 = new Accountant("canRap", 4, 9, 480, "rap"); 
    //     System.out.println(p4.tellProfit()); 
    //     p5.sayHi(); 
    //     System.out.println(Accountant.tellMyRole()); 
    //     System.out.println(p4);
    //      System.out.println(p5); 
    //      // berk barn jamkad's profit is 850. My salary is 390 
    //      // berk barn jamkad's profit is 890. My salary is 480 
    //      // I am an accountant at berk barn jamkad 
    //      // goodAtmyJob 7 6 can sing 
    //      // canRap 4 9 can rap 
    // }
}
