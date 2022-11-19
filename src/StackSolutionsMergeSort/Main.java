package StackSolutionsMergeSort;


import GenericStack.GenericsStack;


import Stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        Stack stack2 = new Stack(5);

        stack1.push(2);
        stack1.push(6);
        stack1.push(1);
        stack1.push(22);
        stack1.push(9);

        stack2.push(3);
        stack2.push(0);
        stack2.push(76);
        stack2.push(52);
        stack2.push(11);

        System.out.println("Stack1: ");
        stack1.display();
        System.out.println("find min: " + findMin(stack1));
        stack1.display();
        System.out.println("Stack2: " );
        stack2.display();

        Stack mergedSorted = mergeAndSort(stack1, stack2);
        System.out.println("Merged and Sorted: ");
        mergedSorted.display();



    }

    public static Stack mergeAndSort(Stack s1, Stack s2){
        Stack sumStack = new Stack(s1.getSize() + s2.getSize());
        Stack sortedStack = new Stack(s1.getSize() + s2.getSize());
        Stack tempStack = new Stack(s1.getSize() + s2.getSize());

        while(!s1.isEmpty()){
            sumStack.push(s1.pop());
        }

        while(!s2.isEmpty()){
            sumStack.push(s2.pop());
        }

        System.out.println("Unsorted Merged Stack: ");
        sumStack.display();

        int i=0;
        int size = sumStack.getSize();

        while(i< size){
            int min = findMin(sumStack);
            System.out.println("min: " + min);
            sortedStack.push(min);

            while(!sumStack.isEmpty()){
                int top = sumStack.pop();
                if(min != top)
                    tempStack.push(top);
            }

            while (!tempStack.isEmpty()){
                sumStack.push(tempStack.pop());
            }

            i++;

        }


        return sortedStack;
    }

    public static int findMin(Stack stk){
        Stack temp = new Stack(stk.getSize());
        int min = stk.pop();
        temp.push(min);

        while(!stk.isEmpty()){
            int top = stk.pop();
            temp.push(top);
            if(top<min) {
                min = top;
            }


        }
        while(!temp.isEmpty()){
            stk.push(temp.pop());
        }
        return min;
    }
}
