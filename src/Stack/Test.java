package Stack;

public class Test {
    public static void main(String[] args) {

        Stack stack1 = new Stack(6);

        stack1.push(5);
        stack1.push(9);
        stack1.push(1);
        stack1.push(3);

        stack1.display();

        stack1.pop();

        stack1.display();
        System.out.println("number of elements: " + stack1.count());
        System.out.println("size of stack: " + stack1.getSize());
        System.out.println("index of top element: " + stack1.getTop());
    }
}
