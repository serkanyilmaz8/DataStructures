package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addFront(60);
        doublyLinkedList.addFront(50);
        doublyLinkedList.addFront(40);
        doublyLinkedList.addFront(30);
        doublyLinkedList.addFront(20);
        doublyLinkedList.addToEnd(70);

        doublyLinkedList.display();
        System.out.println();

        doublyLinkedList.delete(60);
        doublyLinkedList.display();

    }
}
