package BagliListe;

public class BagliListe {
    Node head;
    Node tail;

    public void basaEkle(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void  sonaEkle(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void bastanYazdir(){
        Node iterator = head;

        System.out.print("bas->");
        while(iterator != null){
            System.out.print(iterator.data + "->");
            iterator = iterator.next;
        }
        System.out.print("son");
    }

    public int count(){
        Node iterator = head;
        int count = 0;

        while(iterator != null){
            count++;
            iterator = iterator.next;
        }

        return count;
    }

    public void verilenIndexeEkle(int index, int data){
        Node newNode = new Node(data);
        int count = count();

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }else if(index==0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else{
            Node iterator = head;
            int i = 0;
            while(iterator != null){
                if(i+1 == index)
                    break;
                iterator = iterator.next;
                i++;
            }
            newNode.next = iterator.next;
            iterator.next.prev = newNode;
            iterator.next = newNode;
            newNode.prev = iterator;

        }

    }

    public void sil(int data){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }else if(data == head.data){
            head = head.next;
        }else if(data == tail.data){
            tail.prev.next = null;
            tail = tail.prev;
        }else{
            Node iterator = head;
            while(iterator != null){
                if(iterator.data == data)
                    break;
                iterator = iterator.next;
            }
            iterator.prev.next = iterator.next;
            iterator.next.prev = iterator.prev;

        }

    }

    /*public void sondanYazdir(){
        Node iterator = tail;

        System.out.print("son<-");
        while(iterator != null){
            System.out.print(iterator.data + "<-");
            iterator = iterator.prev;
        }
        System.out.print("bas");
    }*/

}
