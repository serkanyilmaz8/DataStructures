package GenericStack;

public class GenericsStack<T extends Comparable>{
    private T [] items;
    private int top;

    public GenericsStack(Class<T> dataType , int size){
        this.top = -1;
        items = (T[]) java.lang.reflect.Array.newInstance(dataType , size);
    }
    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return items[0];
        } else{
            this.top--;
            return this.items[this.top+1];
        }
    }
    public void push(T val){
        if(isFull()){
            System.out.println("stack is full");
        }else{
            this.top++;
            this.items[this.top]=val;
        }
    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top==this.items.length-1;
    }
    public void display(){
        if(isEmpty())
            System.out.println("stack is empty");
        else{
            for (int i = this.top; i >=0 ; i--) {
                System.out.println(this.items[i]);
            }
        }
    }
    public void clear(){
        this.top=-1;
    }
    public T peek(){
        return this.items[this.top];
    }

}
