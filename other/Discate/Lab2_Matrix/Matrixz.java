import java.util.Arrays;

class Matrixz{
   public static void main(String[] args) {
    int[][] A ={{0,1,0,1},
                {1,1,2,1},
                {0,2,0,0},
                {1,1,0,1}};  
    int n = 2;
    int[][] keep = A;
    for(int pow = 1; pow<n; pow++){
        int[][] Ap = new int[A.length][A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                for(int k=0; k<A.length; k++){
                    Ap[i][j] += A[i][k]*keep[k][j];
                }
            }
        }
    keep = Ap;
    }

    for(int[] a : keep){
        System.out.println(Arrays.toString(a));
    }
        




    
   }


    






}