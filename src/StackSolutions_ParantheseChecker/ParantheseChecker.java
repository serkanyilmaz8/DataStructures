package StackSolutions_ParantheseChecker;

import java.util.Stack;

public class ParantheseChecker {
    public static boolean isCorrect(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);

            switch (c){
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if(!stack.isEmpty()){
                        char ch=stack.pop();
                        if(ch=='(' && c!=')' || ch=='{' && c!='}' || ch=='[' && c!=']')
                            return false;
                    }
                    else{
                        return false;
                    }
            }
        }

        if(!stack.isEmpty())
            return false;
        return true;


    }
}
