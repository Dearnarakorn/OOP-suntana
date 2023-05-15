import java.util.Stack;

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class InfixToTree {
    public static Node infixToTree(String infix) {
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isDigit(ch)) {
                Node operand = new Node(ch);
                stack.push(operand);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                try{
                    Node rightOperand = stack.pop();
                    Node leftOperand = stack.pop();
                    Node operator = new Node(ch);
                    operator.left = leftOperand;
                    operator.right = rightOperand;

                    stack.push(operator);
                }catch (NumberFormatException nfe) {
                    System.out.println(5555555);
                };
            }
        }
        return stack.pop();
    }

    public static void printTree(Node node, int depth) {
        if (node == null) {
            return;
        }
        printTree(node.right, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("   ");
        }
        System.out.println(node.value);
        printTree(node.left, depth + 1);
    }

    public static void main(String[] args) {
        String infix = "1 + 3 / 5";
        Node root = infixToTree(infix);
        printTree(root, 0);
    }
}