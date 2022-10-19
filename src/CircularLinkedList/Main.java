package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFront(5);
        list.addFront(4);
        list.addFront(3);
        list.addFront(2);
        list.addFront(1);
        list.addToEnd(6);
        list.display();
    }
}
