package Collection;

import java.util.ArrayDeque;

public class ArrayDeque_1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(23);
        arrayDeque.addFirst(1);
        arrayDeque.addLast(78);

        System.out.println(arrayDeque);
    }
}
