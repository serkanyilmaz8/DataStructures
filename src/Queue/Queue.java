package Queue;

public class Queue {
    private int front, rear, capacity, size;
    private int[] queue;

    Queue(int cap){
        this.rear=0;
        this.size=0;
        this.front=0;
        this.capacity=cap;
        this.queue = new int[capacity];
    }

    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }

    public boolean isFull(){
        if(size==capacity)
            return true;
        return false;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full. You cannot add a new element.");
            return;
        }
        rear=rear%capacity;
        queue[rear]=val;
        rear++;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty. You cannot dequeue anything.");
            return -1;
        }

        front = front%capacity;
        size--;
        int temp=queue[front];
        front++;
        queue[front-1]=0;
        return temp;
    }

    public int getRear(){
        return queue[rear-1];
    }

    public int getFront() {
        return queue[front];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public void display(){
        System.out.println("Queue:");
        System.out.print("front");
        for (int i:queue){
            System.out.print("<-" + i);
        }
        System.out.print("<-rear");
    }
}