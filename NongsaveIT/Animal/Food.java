package NongsaveIT.Animal;

public abstract class Food {
    protected String name;

    Food(){
        //name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getPower();

}
