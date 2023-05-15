import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static ArrayList<Endpoint> Edge = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);        
        int n = Integer.parseInt(sn.nextLine());  int Eagemax = 0;
        for(int c=0; c<n; c++){
            String[] strword = sn.nextLine().split(","); 
            int[] intword = new int[strword.length];
            for (int i = 0; i < strword.length; i++) {
                intword[i] = Integer.parseInt(strword[i]);
                if(intword[i]>Eagemax)Eagemax=intword[i];
            }
            Edge.add(new Endpoint(intword));
        }
        finddegree(Eagemax);
        System.out.println("line : "+Edge.size()+" "+Edge);
        sn.close();
    }
    static void finddegree(int max){
        int i = 1;
        while (i<=max) {
            int count = 0;
            for(Endpoint endpoint : Edge){
                if(endpoint.findpoint(i))count++;
            }
            System.out.println("degree at v"+i+" : "+count);
            i++;
        }    
    }
}

class Endpoint{
    Set<Integer> Pointlist = new HashSet<Integer>();
    public Endpoint(int...num) {
        for (int i : num) {
            Pointlist.add(i);
        }
    }
    public boolean findpoint(int num){
        for(int i : Pointlist){
          if(i == num)return true;  
        }
        return false;
    }
    public String toString() {
        return ""+Pointlist;
    }
}


