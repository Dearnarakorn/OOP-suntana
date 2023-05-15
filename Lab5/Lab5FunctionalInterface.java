import java.util.Arrays;

public class Lab5FunctionalInterface {
    static int[] data = { 28, 58, 8, 77, 48, 39};
    static ArrayProcessor q1NumberOfEvenElement; // 4
    static ArrayProcessor q2IndexOfLargestEvenValue; // 1
    static ArrayProcessor myMedian; // n/2th element of sorted = 48
public static void main(String[] args) {
    q1(); // 4
    q2(); // 1
    oneline(); // 48
}

static void q1(){
    q1NumberOfEvenElement = num -> {
        int sum=0;
        for(int n:num)if(n%2==0)sum++;    
        return sum;
    };
    System.out.println(q1NumberOfEvenElement.calculate(data));
}

static void q2(){
    q2IndexOfLargestEvenValue = num -> {
        int maxEven=0;
        int index=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0 && num[i]>maxEven){
                maxEven=num[i];
                index=i; 
            }
        }
        return index;
    };
    System.out.println(q2IndexOfLargestEvenValue.calculate(data));
}


 
static void oneline() {
    int[] tmp = Arrays.copyOf(data, data.length);
    Arrays.sort(tmp);
    myMedian = num -> (num[num.length/2]);
    System.out.println(myMedian.calculate(tmp)); // 48
}
}