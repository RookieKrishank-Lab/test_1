package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_1 {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();              // to change the ordering we need to pass Comparator.reverseOrder()

        priorityQueue.offer(89);
        priorityQueue.offer(6);
        priorityQueue.offer(25);
        priorityQueue.offer(36);

        System.out.println(priorityQueue);         // by default it will be in ascending
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());

    }
}
