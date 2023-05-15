


import java.util.Arrays;
import java.util.Scanner;
public class Lab_2 {
    public static void main(String[] args) {
        int[][] A ={{0,1,0,1},
                    {1,1,2,1},
                    {0,2,0,0},
                    {1,1,0,1}};  
        Matrix m = new Matrix(A);
        m.pow(input());
    }

    static int input(){
        System.out.print("input exponent : ");
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        sn.close();
        return n;
    }
}
class Matrix{
    int n;
    int[][] A = new int[n][]; //เก็บตัวตั้งต้น
    int[][] A2 = new int[n][]; //เก็บตัวยกกำลังแต่ละรอบ         
    public Matrix(int[][] a) {
        A = a;
        A2 = a;
        n = a.length;
    }
    public void pow(int exponent){
        for(int ep=1;ep <exponent;ep++){
            int[][] Apow = new int[n][n];
            row(Apow);
            A2 = Apow;
        }
        printpow();
    }
    void row(int[][] Apow){
        for(int i=0;i<A.length;i++){
            colrum(Apow, i);
        }
    }
    void colrum(int[][] Apow,int i){
        for(int j=0;j<A[0].length;j++){
            plus(Apow, i, j);
        }
    }
    void plus(int[][] Apow,int i,int j){
        for(int k=0;k<A.length;k++){    
            Apow[i][j]+=A[i][k]*A2[k][j];
        }
    }
    public void printpow(){
        for(int[] a : A2){
            System.out.println(Arrays.toString(a));
        }
    }    
}