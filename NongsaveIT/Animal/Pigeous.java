package NongsaveIT.Animal;

public class Pigeous extends Bird{

    public Pigeous(){
        super("", 0);
    }
    public Pigeous(String name, int age) {
        super(name, age);
    }

    public void eat(Food F){
        setPower((F.getPower()*2)+getPower());
    }

    public void fly(){
        System.out.println(getName() + "fly fly ....");
    }
    
    
    public void wingAttack(Animal a){
        a.setPower(a.getPower()-5);
    }

    public void wingAttack(Animal a, int times) {
        while(times>0){
            wingAttack(a);
            times--;
        }
    }


    
    
}
