package Test;

public class Smartphone implements Radio, MusicPlayer{
    public void next() {
        Radio.super.next();
    }
    public void startRadio() { System.out.printf("Radio is on.%n"); }
    public void stopRadio() { System.out.printf("Radio is off.%n"); }
    public void start() { System.out.printf("Music Player ready.%n"); }
    public void stop() { System.out.printf("Music Player shut down.%n"); }
    public static void main(String [] args) {
        Smartphone motoG = new Smartphone();
        MusicPlayer.commercial("Motorola"); 
        motoG.next();
        
    }
}




