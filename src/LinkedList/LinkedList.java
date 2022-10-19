package LinkedList;

public class LinkedList<T extends Comparable>{
    private Node<T> head;

    public Node<T> createNode(T val){
        return new Node<>(val);
    }

    public T getValue(){
        return head.value;
    }

    public void addFront(T val){
        Node<T> newNode = new Node<>(val);
        newNode.next=head;
        head = newNode;
    }

    public void addRightAfterHead(T val){
        if(head == null){
            addFront(val);
            //head=createNode(val);
        }
        else{
            Node<T> newNode = new Node<>(val);
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public void addToEnd(T val){
        if(head==null)
            addFront(val);
        else{
            Node<T> iterator = head;
            while(iterator.next!=null)
                iterator = iterator.next;
            iterator.next = createNode(val);
        }
    }


    public boolean search(int val){
        Node<T> iterator = head;
        boolean isThere=false;

        while(iterator != null){
            if(iterator.value.equals(val))
                isThere = true;
            iterator = iterator.next;
        }
        return isThere;
    }

    public int count(int val){
        int count=0;
        Node<T> iterator = head;

        while(iterator != null){
            if(iterator.value.equals(val))
                count++;
            iterator = iterator.next;
        }
        return count;
    }

    public void delete(T val){
        if(head == null)
            return;
        Node<T> iterator = head;


        if(head.value.equals(val)) {
            head = head.next;
            return;
        }

        while(iterator != null){
            if(iterator.next.value.equals(val)){
                iterator.next=iterator.next.next;
                return;
            }
            iterator = iterator.next;
        }
    }

    public void convertToLinkedList(T[] arr){
        if(head == null)
            createNode(arr[0]);
        Node<T> iterator = head;

        for(T item:arr){
            boolean flag = true;
            while(iterator != null){
                if(iterator.value == item)
                    flag = false;
                iterator = iterator.next;
            }
            iterator = head;
            if(flag==true)
                addToEnd(item);
        }
    }

    public int memoryAccess(T[] items){

        if(head == null)
            return 0;

        Node<T> iterator = head;

        int mostTotal = 0;
        for(T item:items){
            int total = 1;
            while(iterator != null){
                if(iterator.value != item)
                    total++;
                else
                    break;
                iterator = iterator.next;
            }
            iterator = head;
            mostTotal += total;
        }
        return mostTotal;
    }

    public int memoryAccess2(T[] items){

        if(head == null)
            return 0;

        Node<T> iterator = head;
        int mostTotal = 0;

        for(T item:items){
            int total = 1;

            while(iterator != null){
                if(iterator.value != item)
                    total++;
                else {
                    T temp = iterator.value;
                    delete(temp);
                    addFront(temp);
                    break;
                }
                iterator = iterator.next;
            }
            iterator = head;
            mostTotal += total;
        }
        return mostTotal;
    }


    public void display(){
        Node<T> iterator = head;
        while(iterator != null){
            System.out.println(iterator);
            iterator=iterator.next;
        }
    }
}
