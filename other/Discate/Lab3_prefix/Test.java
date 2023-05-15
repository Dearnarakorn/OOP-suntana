import java.util.ArrayList;
import java.util.LinkedList;

public class Test{
    public static void main(String[] args) {
        String input = "5 + 2 / 2 - 6";
        equation q1 = new equation(input);
        System.out.println("Infix:   " + q1.getINFIX());
        System.out.println("Prefix:  " + q1.getPREFIX());
        System.out.println("Postfix: " + q1.getPOSTFIX());
        q1.printTreePolishNotation();
    }
}

class equation extends NodeforTree{
    private String input;
    private String postfix;
    private String prefix;
    private LinkedList<String> infix;
    private LinkedList<String> postfixlist;

    equation(String ip){
        input = ip;
        addinfix(input);
        postfixlist = INtoPOST(infix);
        postfix = ListtoString(postfixlist);
        prefix = INtoPRE(infix);
    }

    void addinfix(String ip){
        infix = new LinkedList<>();
        String[] arrip = ip.split(" ");
        for(String arr : arrip)infix.add(arr);
    }

    LinkedList<String> INtoPOST(LinkedList<String> infix){
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
        return postfix;
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
        }catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    void printTreePolishNotation(){
        System.out.println("---Tree---");
        printTree(constructExpressionTree(postfixlist) , 0);
    }

    String getINFIX(){
        return input;
    } 
    String getPREFIX(){
        return prefix;
    } 
    String getPOSTFIX(){
        printTreePolishNotation();
        return postfix;
    }

}

class NodeforTree {
    Node constructExpressionTree(LinkedList<String> string){
        ArrayList<Node> stack = new ArrayList<>();
        for (String s : string){
            Node node = new Node(s);
            if(!isNumeric(s)){
                stack.add(node);
            }else{
                Node right = stack.remove(stack.size()-1);
                Node left = stack.remove(stack.size()-1);
                node.right = right;
                node.left = left;
                stack.add(node);
            }
        }
        return stack.remove(stack.size() - 1);
    }

    void printTree(Node root, int space){
        if(root == null)
            return;
        space += 10;
        printTree(root.right, space);
        System.out.print("\n");
        for(int i = 10; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");

        printTree(root.left, space);
    }

    boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        }catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}


class Node{
    String val;
    Node left;
    Node right;

    Node(String val) {
        this.val = val;
        left = null;
        right = null;
    }
}
