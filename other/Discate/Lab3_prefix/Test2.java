import java.util.LinkedList;

public class Test2{
    public static void main(String[] args) {
        String input = "5 + 2 / 2 - 6";
        input = "12 + 3 * 4 - 2";
        equation q1 = new equation(input);
        System.out.println("Infix:   " + q1.getINFIX());
        System.out.println("Prefix:  " + q1.getPREFIX());
        System.out.println("Postfix: " + q1.getPOSTFIX());
    }
}

class equation{
    private String input;
    private String postfix;
    private String prefix;
    private LinkedList<String> infix;

    equation(String ip){
        input = ip;
        addinfix(input);
        postfix = INtoPOST(infix);
        prefix = INtoPRE(infix);
    }

    void addinfix(String ip){
        infix = new LinkedList<>();
        String[] arrip = ip.split(" ");
        for(String arr : arrip){
            infix.add(arr);
        }
    }

    String INtoPOST(LinkedList<String> infix){
        LinkedList<String> postfix = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();
        for (int i=0; i<infix.size(); i++){ //5 + 2 / 2 - 6
            String s = infix.get(i);
            if(isNumeric(s)){ 
                postfix.add(s);
            }else{
                while (!list.isEmpty() && precedence(s)<=precedence(list.peek())) {  // peek()-ดู
                    postfix.add(list.pop()); //pop()-ดึง
                }
                list.push(s); 
            }
            //System.out.println(postfix+" "+list); 
        }
        while (!list.isEmpty()) {
            postfix.add(list.pop());
        }
        return ListtoString(postfix);
    }

    String INtoPRE(LinkedList<String> infix) {
        LinkedList<String> prefix = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();
        for (int i=infix.size()-1; i>=0; i--) { //5 + 2 / 2 - 6
            String s = infix.get(i);
            if (isNumeric(s)){
                prefix.addFirst(s);
            }else{
                while (!list.isEmpty() && precedence(s)<precedence(list.peek())) {
                    prefix.addFirst(list.pop());
                }
                list.push(s);
            }
            System.out.println(prefix+" "+list);
        }
        while (!list.isEmpty()) {
            prefix.addFirst(list.pop());
        }
        return ListtoString(prefix);
    }

    String ListtoString(LinkedList<String> list){
        StringBuilder sb = new StringBuilder();
        for (String L : list) {
            sb.append(L).append(" ");
            }   
            return sb.toString();
    }

    int precedence(String operator){
        if(operator.equals("*") || operator.equals("/")) return 1;
        else return 0;
    }

    boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    String getINFIX(){
        return input;
    } 
    String getPREFIX(){
        return prefix;
    } 
    String getPOSTFIX(){
        return postfix;
    }
}