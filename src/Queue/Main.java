package Queue;

public class Main {
    public static void main(String[] args) {
       Queue queue1 = new Queue(7);

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.enqueue(6);
        queue1.enqueue(7);

        queue1.dequeue();

        queue1.display();

        System.out.println();

        System.out.println("number of elements: " + queue1.getSize());

        System.out.println("value of rear: " + queue1.getRear());

        System.out.println("value of front: " + queue1.getFront());

        System.out.println("commit deneme");

    }
}
