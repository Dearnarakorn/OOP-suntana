package Test;

public interface Radio{
    public void startRadio();
    public void stopRadio();
    default public void next(){
        System.out.printf("next station%n");
    }
}