package aum;
import java.util.ArrayList;

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
public class expressionTree{
    static Node constructExpressionTree(ArrayList<String> string){
        System.out.println(string);
        ArrayList<Node> stack = new ArrayList<>();
        for (String s : string){
            Node node = new Node(s);
            if(!"+-*/".contains(s)){
                stack.add(node);
            }else{
                Node right = stack.remove(stack.size() - 1);
                Node left = stack.remove(stack.size() - 1);
                node.right = right;
                node.left = left;
                stack.add(node);
            }
        }
        return stack.remove(stack.size() - 1);
    }

    static void printTree(Node root, int gap){
        if(root == null)
            return;
        gap += 10;
        printTree(root.right, gap);
        
        System.out.print("\n");
        for(int i = 10; i < gap; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");
        printTree(root.left, gap);
    }
}