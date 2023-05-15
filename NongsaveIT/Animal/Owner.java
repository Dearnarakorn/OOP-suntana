package NongsaveIT.Animal;


public class Owner {
    protected final String name;
    protected Animal animal;

    public Owner(){
        //animal = null;
        name = "";
    }
    public Owner(String name){
        this.name = name;
    }
    public Owner(Animal animal){
        this.animal = animal;
        this.name = "";
    }
    public Owner(String name, Animal animal){
        this.animal = animal;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void feedFood(Food f){
        animal.setPower(animal.getPower()+f.getPower());
    }
    @Override
    public String toString() {
        return "Owner [name=" + name + ", animal=" + animal + "]";
    }

    public void protectOwnerFrom(Animal a){
        if(animal instanceof Dog){
            ((Dog)animal).kick(a);
        }else if(animal instanceof Pigeous){
            ((Pigeous)animal).wingAttack(a);
        }
    }

    

    
}
