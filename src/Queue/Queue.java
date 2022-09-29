package Queue;

public class Queue {
    private int front;
    private int rear;
    private int size;
    private int[] items;

    public Queue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = -1;
        items = new int[size];
    }

    public int getRear(){
        return items[rear];
    }

    public int getFront() {
        return items[front];
    }

    public boolean isEmpty(){
        return (rear == -1);
    }

    public boolean isFull(){
        return (rear == size-1);
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is Full. You cannot add anything");
        }else{
            rear++;
            items[rear] = data;
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int temp = items[0];
            int i=1;

            while(i <= rear){
                items[i-1] = items[i];
                i++;
            }

            rear--;
            return temp;
        }
    }

    public int count(){
        return rear+1;
    }

    public void display(){
        System.out.print("bas->");
        for(int i=rear; i>=0; i--){
            System.out.print(items[i] + "->");
        }
        System.out.print("son");
    }


}
