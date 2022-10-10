package StackSolutions_InfixToPostfix_Basic;

public class Main {
    public static void main(String[] args) {
        String s = "3+4*5/6";
        InfixToPostfix ıtp = new InfixToPostfix();
        System.out.println("expected output: " + "345*6/+");
        System.out.println("infix: " + s);
        System.out.println("postfix: " + ıtp.infixToPostfix(s));

    }
}
