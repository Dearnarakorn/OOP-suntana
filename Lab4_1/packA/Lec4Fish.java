package Lab4_1.packA;

public class Lec4Fish implements CanSwimIntf{
    
    public Lec4Fish() {
    }

    @Override
    public void swim(){
        System.out.println("flexing my tail back and forth");
    }

    public void fishMethod(){
        System.out.println("do i?");
    }

    // public String fishMethod(){
    //     return String.format("do i?");
    // }
}
