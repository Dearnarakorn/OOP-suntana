import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main8{
    static List<Singer> singerList = new ArrayList<>();
    static{
        singerList.add(new Singer("Aba",Singstyle.POP));
        singerList.add(new Singer("Abi",Singstyle.ROCK));
        singerList.add(new Singer("Abo",Singstyle.POP));
        singerList.add(new Singer("Abe",Singstyle.ROCK));
    }

    public static void main(String[] args) {
        //q0();
        //q1_halfEavhNumber();
        //q2_forEachSingerName();
        q3_lambda_comparator();
        q4_mwthod_reference_comparator();
    }

    static void q0(){
        HalfValueInterface bb = new HalfValueInterface() {
            public void printHalf(int p){
                System.out.println(p/2);
            }
        };
        bb.printHalf(12);
    }

    static void q1_halfEavhNumber(){
        List<Integer> nums = Arrays.asList(100,105);

        HalfValueInterface halfVal = n -> System.out.println(n/2);
        for (int n : nums){
            halfVal.printHalf(n);
        }
        
        Consumer<Integer> consumer = n -> System.out.println(n/2);
        for(int n : nums){
            consumer.accept(n);
        }

        Consumer<Integer> halfMe = n -> System.out.println(n/2);
        nums.forEach(halfMe);
        
        nums.forEach(n -> System.out.println(n/2));

        NumberProcessor np = new NumberProcessor();
        nums.forEach(np::printHalf);
    }

    public static void q2_forEachSingerName(){
        singerList.stream().map(s -> s.getName()).forEach(System.out::println);
        
        singerList.stream().map(Singer::getName).forEach(System.out::println);
    }

    public static void q3_lambda_comparator(){
        Comparator<Singer> byStyle1 = new Comparator<>(){
            @Override
            public int compare(Singer o1, Singer o2){
                return o1.getStyle().compareTo(o2.getStyle());
            }
        };
        Collections.sort(singerList, byStyle1);
        singerList.forEach(System.out::println);
        System.out.println(3.2);
        Comparator<Singer> byStyle2 = (p1,p2) -> p1.getStyle().compareTo(p2.getStyle());
        Collections.sort(singerList, byStyle2);
        singerList.forEach(System.out::println);
    }

    public static void q4_mwthod_reference_comparator(){
        System.out.println(4.1);
        Comparator<Singer> byName = Comparator.comparing(Singer::getName);
        Collections.sort(singerList, byName);
        singerList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println(4.2);
        singerList.sort((s1,s2) -> s1.getStyle().compareTo(s2.getStyle()));
        singerList.forEach(System.out::println);
    }
}



class NumberProcessor {
    public void printHalf(int n){
         System.out.println(n/2);
    }
 }

interface HalfValueInterface {
    public void printHalf(int n);
}