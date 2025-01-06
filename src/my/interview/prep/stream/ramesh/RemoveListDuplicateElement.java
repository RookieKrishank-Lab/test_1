package my.interview.prep.stream.ramesh;

import java.util.Arrays;
import java.util.List;

public class RemoveListDuplicateElement {

    public static void main(String[] args) {

        /*List<String> element = Arrays.asList(
                new String("Raam"),
                new String("xyz"),
                new String("Raam"),
                new String("Abc"),
                "Abc");*/

        List<Integer> numbers = Arrays.asList(8,5,8,1,90,34,5,90);


        System.out.println(numbers.stream().distinct().sorted().toList());
    }
}
