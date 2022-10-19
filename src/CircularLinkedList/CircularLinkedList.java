package CircularLinkedList;

import LinkedList.Node;

public class CircularLinkedList<T extends Comparable> {
    Node<T> head;

    public Node createNode(T val){
        return new Node(val);
    }

    public void addFront(T val){
        if(head == null){
            head = createNode(val);
            head.next = head;
        }else {
            Node<T> iterator = head;
            while (iterator.next != head) {
                iterator = iterator.next;
            }

            Node<T> newNode = createNode(val);
            iterator.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToEnd(T val){
        if(head == null){
            head = createNode(val);
            head.next = head;
        }else{
            Node<T> iterator = head;
            while(iterator.next != head){
                iterator = iterator.next;
            }
            Node<T> newNode = createNode(val);
            iterator.next = newNode;
            newNode.next = head;

        }

    }

    public void display(){
        if(head == null)
            System.out.println("LinkedList is Empty");
        Node<T> iterator = head;
        while(iterator.next != head){
            System.out.print(iterator.value + "->");
            iterator = iterator.next;
        }
        System.out.println(iterator.value);
    }
}
