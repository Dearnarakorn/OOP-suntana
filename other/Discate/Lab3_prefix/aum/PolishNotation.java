package aum;

import java.util.ArrayList;
import java.util.Arrays;

class PolishNotation extends expressionTree{
    private ArrayList<String> prefixAns;
    private ArrayList<String> postfixAns;
    private String []arrInput;
    private int check = 0;

    PolishNotation(String input){
        arrInput = input.split(" ");
    }

    public ArrayList<String> process(String []arr){
        ArrayList<String> answer = new ArrayList<>();
        ArrayList<ArrayList<String>> stack = new ArrayList<ArrayList<String>>();
        stack.add(new ArrayList<String>());
        int n = 0;
        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++){
            String element = arr[i];
            if(!"+-*/()".contains(element)){
                answer.add(element);
            }else if("()".contains(element)){
                if(element.equals("(")){
                    stack.add(new ArrayList<String>());
                    n++;
                }else{
                    for(int e = stack.get(n).size() - 1 ; e >= 0 ; e--){
                        answer.add(stack.get(n).get(e));
                        stack.get(n).remove(e);
                    }
                    stack.remove(n);
                    n--;
                }
                flag = false;
            }else{
                if("+-".contains(element)){
                    if(!stack.get(n).isEmpty() && check == 0){
                        for(int j = stack.get(n).size() - 1 ; j >= 0 ; j--){
                            answer.add(stack.get(n).get(j));
                            stack.get(n).remove(j);
                        }
                    }
                    else if(!stack.get(n).isEmpty() && check == 1){
                        for(int j = stack.get(n).size() - 1 ; j >= 0 && !"+-".contains(stack.get(n).get(stack.get(n).size() - 1)) ; j--){
                            answer.add(stack.get(n).get(j));
                            stack.get(n).remove(j);
                        }
                    }
                    flag = false;
                }else{
                    if(!stack.get(n).isEmpty() && check == 0){
                        if(flag){
                            flag = false;
                            answer.add(stack.get(n).get(stack.get(n).size() - 1));
                            stack.get(n).remove(stack.get(n).remove(stack.get(n).size() - 1));
                        }
                    }else if(!stack.get(n).isEmpty() && !"*/".contains(stack.get(n).get(stack.get(n).size() - 1)) && check == 1){
                        if(flag){
                            flag = false;
                            answer.add(stack.get(n).get(stack.get(n).size()-1));
                            stack.get(n).remove(stack.get(n).remove(stack.get(n).size()-1));
                            
                        }
                    }
                    flag = true;
                }
                stack.get(n).add(element);
            }
        }
        for(int k = stack.get(n).size() - 1 ; k >= 0 && n >= 0 ; k--){
            answer.add(stack.get(n).get(k));
            stack.get(n).remove(k);
        }
        
        return answer;
    }

    public ArrayList<String> reverse(ArrayList<String> arr){
        ArrayList<String> b = new ArrayList<>();
        for (int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i).equals("(")){
                b.add(")");
            }else if(arr.get(i).equals(")")){
                b.add("(");
            }else{
                b.add(arr.get(i));
            }
        }
        return b;
    }

    public String[] reverse(String []arr){
        String[] b = new String[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("(")){
                b[j - 1] = ")";
            }else if(arr[i].equals(")")){
                b[j - 1] = "(";
            }else{
                b[j - 1] = arr[i];
            }
            j = j - 1;
        }
        return b;
    }
    
    public void infix(){
        System.out.print("Infix : ");
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arrInput));
        printAnswer(result);
    }

    public void prefix(){
        System.out.print("Prefix : ");
        check = 1;
        prefixAns = new ArrayList<>(reverse(process(reverse(arrInput))));
        printAnswer(prefixAns);
    }
    
    public void postfix(){
        System.out.print("Postfix : ");
        check = 0;
        postfixAns = new ArrayList<>(process(arrInput));
        printAnswer(postfixAns);
    }

    public void printTreePolishNotation(){
        System.out.println("---Tree---");
        printTree(constructExpressionTree(postfixAns) , 0);
    }

    public String[] getArrInput() {
        return arrInput;
    }

    public void setArrInput(String arrInput) {
        this.arrInput = arrInput.split(" ");
    }
    
    public void printAnswer(ArrayList<String> arrList){
        for(int i = 0; i < arrList.size(); i++){
            System.out.print(arrList.get(i));
        }
        System.out.println();
    }
}
