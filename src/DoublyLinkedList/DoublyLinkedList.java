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

    public void addRightAfterHead(T val){
        DNode newNode = new DNode<>(val);
        if(head == null){
            head =  newNode;
            return;
        }else if(head.next == null) {
            head.next = newNode;
            newNode.prev = head;
        }else{
            newNode.next = head.next;
            head.next.prev = newNode;
            head.next = newNode;
            newNode.prev = head;
        }

    }

    public void addToEnd(T val){
        DNode<T> newNode = new DNode<>(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        DNode iterator = head;
        while(iterator.next != null){
            iterator = iterator.next;
        }
        iterator.next = newNode;
        newNode.prev = iterator;

    }

    public void delete(T val){
        DNode<T> iterator = head;

        if(head.value.equals(val))
            head = head.next;
        /*else if(tail.value.equals(val)){
            tail.prev.next = null;
            tail = tail.prev;
        }*/
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
                newNode.next = null;
                tail = newNode;
            return;
        }
    }

    public double mathAverage(){
        if(head.value instanceof Student){
            DNode iterator = head;
            double total = 0;
            int count = 0;

            while(iterator != null){
                count++;
                Student student = (Student)iterator.value;
                total += student.getMath_grade();
                iterator = iterator.next;
            }

            return total/count;
        }else
            return -1;
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
                    iterator.prev.next = iterator.next;
                    iterator.next.prev = iterator.prev;
                }
                iterator = iterator.next;
            }
        }

    }

    public void count(){
        DNode iterator = head;
        int count = 0;

        while(iterator != null){
            count++;
            iterator = iterator.next;
        }

        System.out.println("Number of students in the class: " + count);

    }

    public void passedMath(){
        double average = mathAverage();
        DNode iterator = head;

        while(iterator != null){
            if(((Student)iterator.value).getMath_grade()>average)
                System.out.println(((Student)iterator.value));
            iterator = iterator.next;
        }
    }

    public void passedData(){
        double average = dataAverage();
        DNode iterator = head;

        while(iterator != null){
            if(((Student)iterator.value).getData_garde()>average)
                System.out.println(((Student)iterator.value));
            iterator = iterator.next;
        }
    }

    public double dataAverage() {
        if(head.value instanceof Student){
            DNode iterator = head;
            double total = 0;
            int count = 0;

            while(iterator != null){
                count++;
                Student student = (Student)iterator.value;
                total += student.getData_garde();
                iterator = iterator.next;
            }

            return total/count;
        }else
            return -1;

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
