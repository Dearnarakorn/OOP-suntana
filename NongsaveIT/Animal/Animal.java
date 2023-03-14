package NongsaveIT.Animal;

public abstract class Animal {
    private String name;
    private int power;
    private int age;
    
    public Animal(){};

    public Animal(String n, int pw, int age){
        name = n;
        power = pw;
        this.age =  age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Animal a){
        if(this.name.equals(a.name) && this.age == a.age){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Animal : name = "+ name + ", power = " + power +", age = "+ age;
    }

    public abstract void eat(Food f);

}
