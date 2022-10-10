package StackSolutions_InfixToPostfix_Basic;

import java.util.Stack;

public class InfixToPostfix {
    public String infixToPostfix(String str){

        Stack<Character> operators=new Stack<>();
        String postfix="";
        char[] infix=str.toCharArray();

        for(char item:infix){
            switch (item){
                case '-':
                case '+':
                case '/':
                case '*':
                    operators.push(item);

                 if(operators.size()>=2){
                     char top=operators.pop();
                     char beforeTop=operators.pop();

                     if(beforeTop=='-'){
                         if(top=='-'){
                             postfix=postfix+beforeTop;
                             operators.push(top);
                         }
                         else{
                             operators.push(beforeTop);
                             operators.push(top);
                         }
                     }

                     if(beforeTop=='+'){
                         if(top=='-' || top=='+'){
                             postfix = postfix+beforeTop;
                             operators.push(top);
                         }
                         else{
                             operators.push(beforeTop);
                             operators.push(top);
                         }
                     }


                     if(beforeTop=='/'){
                         if(top=='-' || top=='+' || top=='/'){
                             postfix = postfix + beforeTop;
                             operators.push(top);
                         }
                         else{
                             operators.push(beforeTop);
                             operators.push(top);
                         }
                     }

                     if(beforeTop=='*') {
                         postfix = postfix + beforeTop;
                         operators.push(top);
                     }

                 }

                    break;
                default:
                    postfix = postfix + item;
            }
        }
        while(!operators.isEmpty()){
            postfix = postfix+operators.pop();
        }


        return postfix;
    }
}
