package Lab3.packA;

public class Programmer extends Lab3EmpTmp {
    

    public Programmer(String name,int experience,int salary){
        super(name,experience,salary);
    }

    @Override
    public void sayHi() {
        System.out.println("(Pro) hi form "+super.getName());
    }

    public String coding(){
        return String.format("Hello World");
    }
}
