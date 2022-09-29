package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue1 = new Queue(7);

        queue1.enQueue(1);
        queue1.enQueue(2);
        queue1.enQueue(3);
        queue1.enQueue(4);

        queue1.deQueue();

        queue1.display();

        System.out.println();

        System.out.println("number of elements: " + queue1.count());

        System.out.println("value of rear: " + queue1.getRear());

        System.out.println("value of front: " + queue1.getFront());

        System.out.println("commit deneme");

    }
}
