package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);                        // add method also does the same method except if the task is fail it will throw exception
        queue.offer(23);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());           //  remove method also remove the head but throw exception if the queue is empty

        System.out.println(queue);

        System.out.println(queue.peek());           //element method also does the same think except it throw exception whenever the queue is empty
    }
}
