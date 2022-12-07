package StackSolutions_ParantheseChecker;

public class Main {
    public static void main(String[] args) {
        String s1 = "(a{c*b})";
        String s2 = "(){}";
        String s3 = "{}{}";

        System.out.println(s1 + ":" + ParantheseChecker.isCorrect(s1));
        System.out.println(s2 + ":" + ParantheseChecker.isCorrect(s2));
        System.out.println(s3 + ":" + ParantheseChecker.isCorrect(s3));
    }
}
