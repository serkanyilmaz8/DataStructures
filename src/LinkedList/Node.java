package LinkedList;

public class Node<T extends Comparable>{
    public T value;
    public Node<T> next;


    public Node(T value) {
        this.value = value;
    }

    public String toString(){
        return String.valueOf(this.value);
    }
}
