package Queue;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      int num = 1221;
     System.out.println("is palindrome: " + isPalindrome(num));
      /*Queue queue1 = new Queue(7);

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.enqueue(6);
        queue1.enqueue(7);

        queue1.dequeue();
        queue1.enqueue(7);

        queue1.display();

        System.out.println();

        System.out.println("number of elements: " + queue1.getSize());

        System.out.println("value of rear: " + queue1.getRear());

        System.out.println("value of front: " + queue1.getFront());

        System.out.println("commit deneme");*/


    }

    public static boolean isPalindrome(int num){
     Stack<Integer> stack = new Stack<>();
     Queue queue = new Queue(5);

     while(num != 0){
       int reminder = num%10;
       stack.push(reminder);
       queue.enqueue(reminder);
       num = num / 10;
     }

     while(!stack.isEmpty()){
       int s = stack.pop();
       int q = queue.dequeue();
       if(s != q)
         return false;
     }
     return true;
    }

}
