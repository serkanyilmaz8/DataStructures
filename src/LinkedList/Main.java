package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer[] items = {2,45,22,3,2,2,2,6,5,4,5,3,3};

        linkedList.convertToLinkedList(items);
        linkedList.display();
        linkedList.reverseList();
       // linkedList.display();
        /*int totalAccess = linkedList.memoryAccess(items);
        double averageAccess = (double)totalAccess / items.length;
        int totalAccess2 = linkedList.memoryAccess2(items);
        double averageAccess2 = (double)totalAccess2 / items.length;
        System.out.println("total memory access: " + totalAccess);
        System.out.println("average memory access: " + averageAccess);
        System.out.println("total memory access 2: " + totalAccess2);
        System.out.println("average memory access 2: " + averageAccess2);*/


        linkedList.display();

    }
}
