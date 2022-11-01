package DoublyLinkedList;

public class DNode<T extends Comparable> {
    T value;
    DNode prev;
    DNode next;

    public DNode(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public String toString(){
        return String.valueOf(this.value);

    }
}
