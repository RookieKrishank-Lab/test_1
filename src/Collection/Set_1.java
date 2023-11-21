package Collection;

import java.util.HashSet;
import java.util.Set;

public class Set_1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(71);
        set.add(2);
        set.add(45);
        set.add(69);
        set.add(17);

        //  HashSet elements are print in an unordered way (added first may not print first). for LinkedHashSet everything will be same except the order will be maintain. Same goes for TreeSet except it is implemented over a Binary tree, so data will be printed in a sorted manner
        //  TreeSet operation take O(1), LinkHashSet take O(logn)
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
