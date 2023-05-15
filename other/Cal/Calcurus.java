public class Calcurus  {
    static function fun = (x,y) ->  (6*x*x) - (3*x*x*y); 
    public static void main(String[] args) {
        double[] listh = {1.0,0.1,0.01,0.001};
        double real = 2 + Math.pow(Math.E, -1);
        System.out.println("real :"+real);
        for(double h : listh){
            double[] listY = new double[(int)(1/h)+1]; 
            listY[0] = 3;
            int idx = 1;
            double x = 0;
            while(true){
                listY[idx] = (listY[idx-1])+ (h*fun.func(x,listY[idx-1]));
                x=(h*1000+x*1000)/1000;
                idx++;
                if(x>=1)break;
            } 
            System.out.printf("h=%.3f y(%.3f) : %f error : %.4f%n" ,h,x,listY[idx-1],real-listY[idx-1]);
        }
    }
}
interface function{
        double func(double x,double y);
}