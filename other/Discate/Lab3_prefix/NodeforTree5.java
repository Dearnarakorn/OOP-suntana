import java.util.ArrayList;
import java.util.LinkedList;

public class NodeforTree5 {
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

