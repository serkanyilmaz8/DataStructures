package DoublyLinkedList;

import LinkedList.Node;
import homework3.Student;

public class DoublyLinkedList<T extends Comparable>{
    DNode<T> head;
    DNode<T> tail;

    public void addFront(T val){
        DNode<T> newNode = new DNode<>(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void addToEnd(T val){
        DNode<T> newNode = new DNode<>(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void delete(T val){
        DNode<T> iterator = head;

        if(head.value.equals(val))
            head = head.next;
        else if(tail.value.equals(val)){
            tail.prev.next = null;
            tail = tail.prev;
        }
        else{
             while(iterator != null){
                 if(iterator.value.equals(val)){
                     iterator.prev.next = iterator.next;
                     iterator.next.prev = iterator.prev;
                 }
                 iterator = iterator.next;
             }
        }
    }

    public void sortedAdd(T val){
        DNode<T> newNode = new DNode<>(val);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }else if(head.value.compareTo(newNode.value) == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else{
            DNode iterator = head;
            //DNode prev = head;
            while(iterator != null){
                if(newNode.value.compareTo(iterator.value) == -1)
                    break;
                //prev = iterator;
                iterator = iterator.next;
            }
            if(iterator != null){
                iterator.prev.next = newNode;
                newNode.prev = iterator.prev;
                newNode.next = iterator;
                iterator.prev = newNode;
            }
            else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    }

    public void sortedAddByDataStructure(Student val){
        DNode newNode = new DNode<>(val);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else if(((Student)head.value).compareDataStructures(val) == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else{
            DNode iterator = head;
            //DNode prev = head;
            while(iterator != null){
                if(((Student)iterator.value).compareDataStructures(val) == 1)
                    break;
                //prev = iterator;
                iterator = iterator.next;
            }
            if(iterator != null){
                iterator.prev.next = newNode;
                newNode.prev = iterator.prev;
                newNode.next = iterator;
                iterator.prev = newNode;
                return;
            }
            else
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            return;
        }
    }

    public void mathAverage(){
        if(head.value instanceof Student){
            DNode iterator = head;
            int total = 0;
            int count = 0;

            while(iterator != null){
                count++;
                Student student = (Student)iterator.value;
                total += student.getMath_grade();
                iterator = iterator.next;
            }

            System.out.println("average of Math grades: " + total/count);
        }else
            return;
    }

    public void lowestDS(){
        if(head.value instanceof Student){
            DNode iterator = head;
            Student headVal = (Student)head.value;

            while(iterator != null){
                Student student = (Student)iterator.value;
                if(student.compareDataStructures(headVal) == 0)
                    System.out.println(student);
                iterator = iterator.next;
            }

        }else
            return;
    }

    public void deleteById(String id){
        DNode<T> iterator = head;

        if(((Student)head.value).getId().equals(id)){
            head = head.next;
        }

        else if(((Student)tail.value).getId().equals(id)){
            tail.prev.next = null;
            tail = tail.prev;
        }
        else{
            while(iterator != null){
                if(((Student)iterator.value).getId().equals(id)){
                    //iterator.prev.next = iterator.next;
                    iterator.next.prev = iterator.prev;
                }
                iterator = iterator.next;
            }
        }

    }


    public void display(){
        DNode<T> iterator = head;

        System.out.println("head->");
        while(iterator != null){
            System.out.println(iterator + "->");
            iterator = iterator.next;
        }
        System.out.print("end");

    }
}
