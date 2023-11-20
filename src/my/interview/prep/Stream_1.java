package my.interview.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Even number from the list of numbers using stream and without it
public class Stream_1 {

    public static void main(String[] args) {

        //Different way of defining a list
        List<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(645);

        List<Integer> l2 = List.of(2,5,23,54,72,16);                           //.of method was introduced in java 9

        List<Integer> l3 = Arrays.asList(324,52,21);

        //Without stream
        List<Integer> evenList = new ArrayList<>();

        for (Integer i :l2) {
            if(i%2==0){
                evenList.add(i);
            }
        }
        System.out.println(evenList);
    }

}
