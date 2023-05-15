class Integrate {
    public interface FofX {
        double eval(double x);
    }

    static final int LEFT_POINT = 0;
    static final int MID_POINT = 1;
    static final int RIGHT_POINT = 2;

    static double integrate(FofX f, double a, double b, int interval, int point) {
        double sum=0;
        double dx=(b-a)/interval;
        for(int i=0; i<interval; i++) {
            switch(point) {
                case LEFT_POINT: sum+=f.eval(a+i*dx)*dx; break;
                case MID_POINT: sum+=f.eval(a+i*dx+dx/2)*dx; break;
                case RIGHT_POINT: sum+=f.eval(a+i*dx+dx)*dx; break;
            }
        }
        return sum;
    }

    static double integrate2(FofX f, double a, double b, int interval,int p) {
        double sum=0;
        double d = b-a;
        double xi=0;
        double factor=interval*(interval+1)/2;
        for(int i=0; i<interval; i++) {
            double dxi = d*(interval-i)/factor;
            if(p==0)sum+=f.eval(xi)*dxi;  
            else if(p==1)sum+=f.eval(xi+dxi/2)*dxi; 
            else sum+=f.eval(xi+dxi)*dxi; 
            //sum+=f.eval(xi)*dxi;          // left point
            //sum+=f.eval(xi+dxi/2)*dxi;      // right point
            //sum+=f.eval(xi+dxi)*dxi;      // mid point
            xi+=dxi;
        }
        return sum;
    }

    // public static void main(String args[]) {
    //     //FofX f = (x) ->  x*x;
    //     FofX f = (x) ->  Math.exp(x);
    //     //double ans = 1.0 / 3.0;
    //     double ans = Math.E-1;
    //     int interval = 0;
    //     for(int i=0; i<=1000000; i++){
    //         interval = i;
    //         if( Math.abs(ans-integrate(f, 0, 1, interval, LEFT_POINT))<0.001 && Math.abs(ans-integrate(f, 0, 1, interval, MID_POINT))<0.001 && Math.abs(ans-integrate(f, 0, 1, interval, RIGHT_POINT))<0.001){
    //             if( Math.abs(ans-integrate2(f, 0, 1, interval,0))<0.001 &&  Math.abs(ans-integrate2(f, 0, 1, interval,1))<0.001 &&  Math.abs(ans-integrate2(f, 0, 1, interval,2))<0.001){
    //                 System.out.println(i);
    //                 break;
    //             }
    //         }
    //     }
    // }

    public static void main(String args[]) {
         FofX f = (x) ->  x*x;
         double ans = 1.0 / 3.0;

        //FofX f = (x) ->  Math.exp(x);
        //double ans = Math.E-1;
        int interval = 0;
        for(int i=0; i<=1000000; i++){
            interval = i;
            if(Math.abs(ans-integrate(f, 0, 1, interval, MID_POINT))<0.001){
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}