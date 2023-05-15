package NongsaveIT.Animal;

public abstract class Bird extends Animal implements Flyable{
    
    public Bird(String name, int age){
        super(name, 150, age);
    }

    public abstract void wingAttack(Animal a);    

    @Override
    public void fly() { 
        //System.out.println("Weeeeeee");
    }
}
