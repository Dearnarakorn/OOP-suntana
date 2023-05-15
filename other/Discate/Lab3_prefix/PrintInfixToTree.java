public class PrintInfixToTree {
    TreeNode infixToTree(String infix) {
        return infixToTreeHelper(infix, 0, infix.length() - 1);
    }

    TreeNode infixToTreeHelper(String infix, int start, int end) {
        if (start > end) {
            return null;
        }
        int index = findOperatorIndex(infix, start, end);
        if (index == -1) {
            return new TreeNode(infix.charAt(start));
        }
        TreeNode root = new TreeNode(infix.charAt(index));
        root.left = infixToTreeHelper(infix, start, index - 1);
        root.right = infixToTreeHelper(infix, index + 1, end);
        return root;
    }

    int findOperatorIndex(String infix, int start, int end) {
        int count = 0;
        for (int i = end; i >= start; i--) {
            if (infix.charAt(i) == ')') {
                count++;
            }
            else if (infix.charAt(i) == '(') {
                count--;
            }
            else if (count == 0 && (infix.charAt(i) == '+' || infix.charAt(i) == '-')) {
                return i;
            }
        }
        count = 0;
        for (int i = end; i >= start; i--) {
            if (infix.charAt(i) == ')') {
                count++;
            }
            else if (infix.charAt(i) == '(') {
                count--;
            }
            else if (count == 0 && (infix.charAt(i) == '*' || infix.charAt(i) == '/')) {
                return i;
            }
        }
        return -1;
    }

    void printTree(TreeNode root, int indent) {
        if (root == null) {
            return;
        }
        printTree(root.right, indent + 4);
        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
        System.out.println(root.val);
        printTree(root.left, indent + 4);
    }


    public static void main(String[] args) {
        PrintInfixToTree a = new PrintInfixToTree();
        String infix = "2*5+3-1/2";
        TreeNode root = a.infixToTree(infix);
        a.printTree(root, 0);
    }
}

class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode(char x) {
        val = x;
        left = null;
        right = null;
    }
}
