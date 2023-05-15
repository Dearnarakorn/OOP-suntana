package Test;

public interface MusicPlayer{
    public void start();
    public void stop();
    default public void next(){
        System.out.printf("next song%n");
    }
    public static void commercial(String sponsor){
        System.out.printf("program brought to you by %s%n",sponsor);
    }
}
