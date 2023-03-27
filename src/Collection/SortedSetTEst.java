package Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTEst {
    public static void main(String[] args){
        SortedSet set = new TreeSet();
//        SortedSet set2 = new SortedSet();
        set.add("x");
        set.add("b");
        set.add("a");
        set.add("r");
        set.add("r");
//        set.add(null);

        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
