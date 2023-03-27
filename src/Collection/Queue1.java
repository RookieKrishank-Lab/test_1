package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

    public static void main(String[] args){
    Queue<Integer> queue = new LinkedList<>();

    //add
    queue.offer(22);
    queue.offer(73);
    queue.offer(63);
    System.out.println(queue);

    //remove
    System.out.println("the remove element is "+queue.poll());
    System.out.println(queue);

    //to see the front element
        System.out.println("the first element "+queue.peek());
    }
}
