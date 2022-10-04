package GenericStack;
import Stack.Stack;

public class GenericTest {

    public static void main(String[] args) {
        GenericsStack<String> myStk = new GenericsStack<>(String.class, 15);
        String[] paranthesis = {"(", ")", "(", ")", "(", "[", "]", ")"};

        boolean trurth = isBalances(paranthesis);
        if(trurth)
            System.out.println("balanced");
        else
            System.out.println("unbalanced");

    }

    public static boolean isBalances(String[] prn) {
        GenericsStack<String> myStack = new GenericsStack<>(String.class, prn.length / 2);
        if (prn.length % 2 == 1) {
            return false;
        }
        for (int i = 0; i < prn.length; i++) {
            if (prn[i]=="(" || prn[i]=="[" || prn[i]=="{") {
                myStack.push(prn[i]);
            }else if(prn[i]==")" || prn[i]=="}" || prn[i]=="]"){
                if(myStack.isEmpty())
                    return false;
                else
                    myStack.pop();
            }

        }
        if (myStack.isEmpty()) {
            return true;
        } return false;
    }
}