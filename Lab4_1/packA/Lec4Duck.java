package Lab4_1.packA;

public class Lec4Duck implements CanSwimIntf{

    @Override
    public void swim() {
        System.out.println("waddling");
    }

    public void duckMethod(){
        System.out.println("quack");
    }

//     public String duckMethod(){
//         return String.format("quack");
//     } 
}