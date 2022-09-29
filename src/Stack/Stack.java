package Stack;

public class Stack {
    private int top = -1;
    private int[] items;
    private int size;

    public Stack(int size) {
        this.size = size;
        items = new int[size];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size-1);
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        } else{
            top++;
            items[top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            top--;
            return items[top+1];
        }
    }

    public int count(){
        return this.top+1;
    }

    public int getSize(){
        return this.size;
    }

    public int getTop() {
        return this.top;
    }

    public void display(){
        System.out.println("stack is: ");
        for (int i=top; i>=0; i--){
            System.out.println(items[i]);
        }
    }
}
