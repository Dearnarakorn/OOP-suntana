package aum;

public class Main {
    public static void main(String[] args) {
        String input = "5 + 2 / 2 - 6" ;
        PolishNotation pn = new PolishNotation(input);
        pn.infix();
        pn.prefix();
        pn.postfix();
        pn.printTreePolishNotation();
    }
}
